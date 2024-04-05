package br.com.api.fatec.apifatec;

import br.com.api.fatec.apifatec.domain.produto.ProdutoRepository;
import br.com.api.fatec.apifatec.entities.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.api.fatec.apifatec.domain.cliente.ClienteRepository;
import br.com.api.fatec.apifatec.entities.Cliente;

@SpringBootApplication
public class ApiFatecApplication {
	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository clienteRepository, @Autowired ProdutoRepository produtoRepository) {
		return args -> {
			Cliente cliente = new Cliente();
			cliente.setNome("Danilo");
			cliente.setEmail("h2danilofatec@hotmail.com");
			cliente.setEndereco("Rua xxx, 126");
			cliente.setRazaoSocial("Danilo");
			
			clienteRepository.save(cliente);
			
			Cliente cliente2 = new Cliente();
			cliente2.setNome("Arthur");
			cliente2.setEmail("h2danilosfatec@hotmail.com");
			cliente2.setEndereco("Rua xxx, 126");
			cliente2.setRazaoSocial("Arthur");
			
			clienteRepository.save(cliente2);

			Produto produto = new Produto();
			produto.setNome("Coca-cola");
			produto.setDescricao("Refrigerante de Cola");
			produto.setPreco(3.15);
			produto.setQtdEstoque(20);

			produtoRepository.save(produto);
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
	}
}
