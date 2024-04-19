package br.com.api.fatec.apifatec.domain.pedidoVendaItem;

import java.util.stream.Collectors;
import java.util.List;

import br.com.api.fatec.apifatec.entities.PedidoVendaItem;

public class PedidoVendaItemMapper {

    public static PedidoVendaItem toEntity(PedidoVendaItemDTO dto){
        PedidoVendaItem pedidoVendaItem = new PedidoVendaItem();
        pedidoVendaItem.setId(dto.getId());
        pedidoVendaItem.setPedidoVenda(dto.getPedidoVenda());
        pedidoVendaItem.setProduto(dto.getProduto());
        pedidoVendaItem.setQuantidade(dto.getQuantidade());
        pedidoVendaItem.setValorTotal(dto.getValorTotal());
        pedidoVendaItem.setValorUnitario(dto.getValorUnitario());
        return pedidoVendaItem;
    }

    public static PedidoVendaItemDTO toDTO(PedidoVendaItem pedidoVendaItem){
        PedidoVendaItemDTO pedidoVendaItemDTO = new PedidoVendaItemDTO();
        pedidoVendaItemDTO.setId(pedidoVendaItem.getId());
        pedidoVendaItemDTO.setPedidoVenda(pedidoVendaItem.getPedidoVenda());
        pedidoVendaItemDTO.setProduto(pedidoVendaItem.getProduto());
        pedidoVendaItemDTO.setQuantidade(pedidoVendaItem.getQuantidade());
        pedidoVendaItemDTO.setValorTotal(pedidoVendaItem.getValorTotal());
        pedidoVendaItemDTO.setValorUnitario(pedidoVendaItem.getValorUnitario());
        return pedidoVendaItemDTO;
    }
    List<PedidoVendaItemDTO> toDTOList(List<PedidoVendaItem> pedidos){
        return pedidos.stream().map(PedidoVendaItemMapper::toDTO).collect(Collectors.toList());
    }

}