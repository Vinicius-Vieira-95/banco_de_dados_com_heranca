package com.vnc.heranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vnc.heranca.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
