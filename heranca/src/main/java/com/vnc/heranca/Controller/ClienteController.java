package com.vnc.heranca.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnc.heranca.entities.Cliente;
import com.vnc.heranca.entities.Pessoa;
import com.vnc.heranca.services.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> insert() {
        Cliente c1 = new Cliente();
        c1.setNome("Jessica");
        c1.setSobrenome("Santos");
        c1.setEndereco("Heribaldo");
        c1.setIdade(28);
        
        var cliente  = clienteService.insert2(c1);
        return ResponseEntity.ok().body(cliente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> get(@PathVariable("id") Long id) {
        var c = clienteService.getClienteId(id);
        return ResponseEntity.ok().body(c);
    }

}
