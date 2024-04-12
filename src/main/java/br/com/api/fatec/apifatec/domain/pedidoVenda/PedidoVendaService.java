package br.com.api.fatec.apifatec.domain.pedidoVenda;

import br.com.api.fatec.apifatec.entities.PedidoVenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoVendaService {
    @Autowired
    private PedidoVendaRepository pedidoRepository;

    public List<PedidoVenda> listarPedidos(){
        return pedidoRepository.findAll();
    }
    public PedidoVenda encontrarPedidoPorId(long id){
        return pedidoRepository.findById(id).orElse(null);
    }
    public PedidoVenda salvarPedido(PedidoVenda pedido){
        return pedidoRepository.save(pedido);
    }
    public void deletarPedido(Long id){
        if (encontrarPedidoPorId(id) != null){
            pedidoRepository.deleteById(id);
        }
        else{
            throw new IllegalArgumentException("Pedido informado não existe");
        }
    }

    public PedidoVenda atualizarPedidoVenda(Long id, PedidoVenda pedido){
        PedidoVenda pedidoCadastradoPedido = encontrarPedidoPorId(id);
        
        if(pedidoCadastradoPedido == null){
            return null;
        }
        else{
            pedidoCadastradoPedido.setId_cliente(pedido.getId_cliente());
            pedidoCadastradoPedido.setEmissao(pedido.getEmissao());
            pedidoCadastradoPedido.setTotal(pedido.getTotal());
            pedidoCadastradoPedido.setStatus(pedido.getStatus());
            return pedidoRepository.save(pedidoCadastradoPedido);
        }
    }
}
