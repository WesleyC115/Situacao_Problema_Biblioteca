package com.example.demo.controller;

import com.example.demo.database.ClienteDatabase;
import com.example.demo.database.EmprestimoDatabase;
import com.example.demo.database.LivroDatabase;
import com.example.demo.model.Cliente;
import com.example.demo.model.Emprestimo;
import com.example.demo.model.Livro;

import java.util.List;

public class EmprestimoController {
    EmprestimoDatabase bcoEmprestimo = EmprestimoDatabase.getInstance();
    ClienteDatabase bcoClientes = ClienteDatabase.getInstance();
    LivroDatabase bcoLivros = LivroDatabase.getInstance();

    public List<Emprestimo> getAllEmprestimos() {
        return EmprestimoDatabase.findAll();
    }

    public Boolean save(Emprestimo e) {
        List<Cliente> clientesCadastrados = bcoClientes.findAll();
        List<Livro> livrosCadastrados = bcoLivros.findAll();

        Cliente clienteEnviado = e.getCliente();
        List<Livro> livrosEnviados = e.getLivrosEmprestados();

        // verifica se o cliente está dentro da lista
        if (bcoClientes.findOne(clienteEnviado.getIdCliente()) == null){
            return false;
        }

        // verifica se os produtos enviados estão dentro da lista
        for (Livro l : livrosEnviados){
            if (bcoLivros.findOne(l.getIdLivro()) == null){
                return false;
            }
        }

        bcoEmprestimo.insert(e);
        return true;
    }
}
