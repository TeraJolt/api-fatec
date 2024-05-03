package br.com.api.fatec.apifatec.domain.pedidoVenda.dtos;

import br.com.api.fatec.apifatec.shared.enums.PedidoVendaStatusEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidoVendaDto {
    private Long id;
    private Long clienteId;
    private LocalDate emissao;
    private BigDecimal total;
    @Enumerated(EnumType.STRING)
    private PedidoVendaStatusEnum status;
    private List<PedidoVendaItemDto> items = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDate emissao) {
        this.emissao = emissao;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public PedidoVendaStatusEnum getStatus() {
        return status;
    }

    public void setStatus(PedidoVendaStatusEnum status) {
        this.status = status;
    }

    public List<PedidoVendaItemDto> getItems() {
        return items;
    }

    public void setItems(List<PedidoVendaItemDto> items) {
        this.items = items;
    }
}