package com.programacao.web.fatec.apifatec.domain.cliente;
import br.com.api.fatec.apifatec.entities.Cliente;

import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

public class ClienteRepository extends JpaRepository<Cliente, Long>{

}
