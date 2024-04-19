package br.com.api.fatec.apifatec.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.fatec.apifatec.domain.pedidoVenda.PedidoVendaService;
import br.com.api.fatec.apifatec.entities.PedidoVenda;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController()
@RequestMapping("/api/pedidoVenda/v1")
class PedidoVendaController {
    @Autowired
    private PedidoVendaService pedidoVendaService;

    @GetMapping
    public ResponseEntity<List<PedidoVenda>> listarPedidosVenda() {
        List<PedidoVenda> pedidoVenda = pedidoVendaService.listarPedidos();
        return new ResponseEntity<>(pedidoVenda, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoVenda> encontrarPedidoVendaPorId(@PathVariable Long id) {
        PedidoVenda pedidoVenda = pedidoVendaService.encontrarPedidoPorId(id);
        return pedidoVenda != null ? new ResponseEntity<>(pedidoVenda,HttpStatus.OK):
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping()
    public ResponseEntity<PedidoVenda> salvarPedidoVenda(@RequestBody PedidoVenda pedidoVenda) {
        PedidoVenda pedidoVendaSalvo = pedidoVendaService.salvarPedido(pedidoVenda);
        return new ResponseEntity<>(pedidoVenda,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPedido(@PathVariable Long id){
        pedidoVendaService.deletarPedido(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
    
}
