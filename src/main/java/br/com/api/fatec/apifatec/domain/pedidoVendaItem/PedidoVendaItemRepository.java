package br.com.api.fatec.apifatec.domain.pedidoVendaItem;

import br.com.api.fatec.apifatec.entities.PedidoVendaItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoVendaItemRepository extends JpaRepository<PedidoVendaItem, Long>{
    
}
