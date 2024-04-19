package br.com.api.fatec.apifatec.domain.pedidoVenda;

import java.util.stream.Collectors;
import java.util.List;


import br.com.api.fatec.apifatec.entities.PedidoVenda;

public class PedidoVendaMapper {
    
    public static PedidoVenda toEntity(PedidoVendaDTO dto){
        PedidoVenda pedido = new PedidoVenda();
        pedido.setId(dto.getId());
        pedido.setCliente(dto.getCliente());
        pedido.setEmissao(dto.getEmissao());
        pedido.setTotal(dto.getTotal());
        pedido.setStatus(dto.getStatus());
        return pedido;
    }

    public static PedidoVendaDTO toDTO(PedidoVenda pedido){
        PedidoVendaDTO dto = new PedidoVendaDTO();
        dto.setId(pedido.getId());
        dto.setCliente(pedido.getCliente());
        dto.setEmissao(pedido.getEmissao());
        dto.setTotal(pedido.getTotal());
        dto.setStatus(pedido.getStatus());
        return dto;
    }
    List<PedidoVendaDTO> toDTOList(List<PedidoVenda> pedidos){
        return pedidos.stream().map(PedidoVendaMapper::toDTO).collect(Collectors.toList());
    }
}
