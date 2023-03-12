package com.vnc.heranca.repositories;

import com.vnc.heranca.entities.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
