package com.vnc.heranca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnc.heranca.entities.Funcionario;
import com.vnc.heranca.repositories.FuncionarioRepository;
import com.vnc.heranca.repositories.PessoaRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private PessoaRepository pessoaRepository;

    public Funcionario insert1(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario insert2(Funcionario funcionario) {
        var c = pessoaRepository.save(funcionario);
        return c;
    }

    public Funcionario getFuncionarioId(Long id) {
        return (Funcionario) pessoaRepository.getReferenceById(id);
    }

    public void deleteFuncionarioById(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
