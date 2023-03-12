package com.vnc.heranca.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Funcionario extends Pessoa{
    
    private String cargo;
    private Double salario;
}
