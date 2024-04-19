package br.com.api.fatec.apifatec.domain.pedidoVendaItem;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.api.fatec.apifatec.entities.PedidoVendaItem;

@Service
public class PedidoVendaItemService {
    @Autowired
    private PedidoVendaItemRepository pedidoVendaItemRepository;

    public List<PedidoVendaItem> listarPedidosVendaItem(){
        return pedidoVendaItemRepository.findAll();
    }
    public PedidoVendaItem encontrarPedidoVendaItemPorId(long id){
        return pedidoVendaItemRepository.findById(id).orElse(null);
    }
    public PedidoVendaItem salvarPedidoVendaItem(PedidoVendaItem pedidoVendaItem){
        return pedidoVendaItemRepository.save(pedidoVendaItem);
    }
    public void deletarPedidoVendaItem(Long id){
        if (encontrarPedidoVendaItemPorId(id)!=null){
            pedidoVendaItemRepository.deleteById(id);
        }
        else{
            throw new IllegalArgumentException("Item de pedido informado não existe");
        }
    }

    public PedidoVendaItem atualizarPedidoVendaItem(Long id, PedidoVendaItem pedido){
        PedidoVendaItem pedidoVendaItemCadastrado = encontrarPedidoVendaItemPorId(id);

        if(pedidoVendaItemCadastrado == null){
            return null;
        }
        else{
            pedidoVendaItemCadastrado.setPedidoVenda(pedido.getPedidoVenda());
            pedidoVendaItemCadastrado.setProduto(pedido.getProduto());
            pedidoVendaItemCadastrado.setQuantidade(pedido.getQuantidade());
            pedidoVendaItemCadastrado.setValorTotal(pedido.getValorTotal());
            pedidoVendaItemCadastrado.setValorUnitario(pedido.getValorUnitario());
            return pedidoVendaItemRepository.save(pedidoVendaItemCadastrado);
        }
    }
    
}
