package br.com.api.fatec.apifatec.domain.pedidoVenda;

public class PedidoVendaDTO {
    private Long id;
    private int id_cliente;
    private String emissao;
    private double total;
    private String status;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public int getId_cliente(){
        return id_cliente;
    }
    public void setId_cliente(int id_cliente){
        this.id_cliente = id_cliente;
    }

    public String getEmissao(){
        return emissao;
    }
    public void setEmissao(String emissao){
        this.emissao = emissao;
    }

    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total = total;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}   
