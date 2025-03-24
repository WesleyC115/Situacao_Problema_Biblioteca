package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente {
    private Long idCliente;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
}
