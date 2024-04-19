package br.com.api.fatec.apifatec.domain.pedidoVenda;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.api.fatec.apifatec.entities.Cliente;
import br.com.api.fatec.apifatec.entities.PedidoVendaItem;
import br.com.api.fatec.apifatec.entities.PedidoVendaStatusEnum;

public class PedidoVendaDTO {
    private Long id;
    private Cliente cliente;
    private LocalDate emissao;
    private BigDecimal total;
    private PedidoVendaStatusEnum status;
    private List<PedidoVendaItem> items = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public List<PedidoVendaItem> getItems() {
        return items;
    }

    public void addItem(PedidoVendaItem item) {
        this.items.add(item);
    }
}