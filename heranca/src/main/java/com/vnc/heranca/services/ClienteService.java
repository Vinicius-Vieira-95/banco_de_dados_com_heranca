package com.vnc.heranca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnc.heranca.entities.Cliente;
import com.vnc.heranca.entities.Pessoa;
import com.vnc.heranca.repositories.ClienteRepository;
import com.vnc.heranca.repositories.PessoaRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PessoaRepository pessoaRepository;

    public Cliente insert1(Cliente cliente) {
        return pessoaRepository.save(cliente);
    }

    public Cliente insert2(Cliente cliente) {
        var c = clienteRepository.save(cliente);
        return c;
    }

    public Cliente getClienteId(Long id) {
        var p = clienteRepository.getReferenceById(id);
        Cliente c = new Cliente();
        c.setId(p.getId());
        c.setNome(p.getNome());
        c.setSobrenome(p.getSobrenome());
        c.setIdade(p.getIdade());
        c.setEndereco(p.getEndereco());
        return c;
    }

    public void deleteClienteById(Long id) {
        clienteRepository.deleteById(id);
    }

}