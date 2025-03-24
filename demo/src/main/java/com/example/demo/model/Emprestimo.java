package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Emprestimo {
    private Long idEmprestimo;
    private Date dataInicio = new Date();
    private Date dataFim = new Date();
    private Cliente cliente;
    private ArrayList<Livro> livrosEmprestados;

}
