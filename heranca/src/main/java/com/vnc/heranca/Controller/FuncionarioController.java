package com.vnc.heranca.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnc.heranca.entities.Funcionario;
import com.vnc.heranca.services.FuncionarioService;

@RestController
@RequestMapping(value = "/func")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<Funcionario> insert() {
        Funcionario f1 = new Funcionario();
        f1.setNome("Joao");
        f1.setSobrenome("Santos");
        f1.setSalario(3000.00);
        f1.setCargo("Desenvolvedor");
        f1.setIdade(25);
        
        var cliente  = funcionarioService.insert2(f1);
        return ResponseEntity.ok().body(cliente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> get(@PathVariable("id") Long id) {
        var f = funcionarioService.getFuncionarioId(id);
        return ResponseEntity.ok().body(f);
    }
}
