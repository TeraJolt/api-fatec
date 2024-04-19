package br.com.api.fatec.apifatec.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.api.fatec.apifatec.domain.pedidoVendaItem.PedidoVendaItemService;
import br.com.api.fatec.apifatec.entities.PedidoVendaItem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController()
@RequestMapping("/api/pedidoVendaItem/v1")
public class PedidoVendaItemController {
    @Autowired
    private PedidoVendaItemService pedidoVendaItemService;

    @GetMapping
    public ResponseEntity<List<PedidoVendaItem>> ListarPedidosVendaItem() {
        List<PedidoVendaItem> pedidoVendaItem = pedidoVendaItemService.listarPedidosVendaItem();
        return new ResponseEntity<>(pedidoVendaItem, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoVendaItem> encontrarPedidoVendaItemPorId(@PathVariable Integer id) {
        PedidoVendaItem pedidoVendaItem = pedidoVendaItemService.encontrarPedidoVendaItemPorId(id);
        return pedidoVendaItem != null ? new ResponseEntity<>(pedidoVendaItem,HttpStatus.OK):
        new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @PostMapping()
    public ResponseEntity<PedidoVendaItem> salvarPedidoVendaItem(@RequestBody PedidoVendaItem pedidoVendaItem) {
        PedidoVendaItem pedidoVendaItemSalvo = pedidoVendaItemService.salvarPedidoVendaItem(pedidoVendaItem);
        return new ResponseEntity<>(pedidoVendaItem,HttpStatus.CREATED);
    }

    
    
}
