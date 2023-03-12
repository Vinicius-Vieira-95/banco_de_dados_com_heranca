package com.vnc.heranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vnc.heranca.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    
}
