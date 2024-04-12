package br.com.api.fatec.apifatec.domain.pedidoVenda;

import br.com.api.fatec.apifatec.entities.PedidoVenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoVendaRepository extends JpaRepository<PedidoVenda, Long>{

}