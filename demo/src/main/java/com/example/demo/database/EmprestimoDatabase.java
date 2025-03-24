package com.example.demo.database;

import com.example.demo.model.Emprestimo;
import com.example.demo.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoDatabase {
    private static EmprestimoDatabase instance;

    // Lista de vendas
    private static List<Emprestimo> emprestimo;

    // Construtor privado para evitar a criação de instâncias fora da classe
    private EmprestimoDatabase() {
        this.emprestimo = new ArrayList<>();
    }

    // Método público e estático para obter a instância única
    public static EmprestimoDatabase getInstance() {
        if (instance == null) {
            instance = new EmprestimoDatabase();  // Cria a instância na primeira vez que for chamada
        }
        return instance;
    }

    // Insere uma nova venda na lista
    public void insert(Emprestimo e) {
        emprestimo.add(e);
    }

    // Busca uma venda pelo ID
    public Emprestimo findOne(int id) {
        for (Emprestimo e : emprestimo) {
            if (e.getIdEmprestimo() == id) {
                return e;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todas as vendas cadastradas
    public static List<Emprestimo> findAll() {
        return new ArrayList<>(emprestimo);
    }

    // Atualiza uma venda existente na lista
    public boolean update(Emprestimo e) {
        for (int i = 0; i < emprestimo.size(); i++) {
            if (emprestimo.get(i).getIdEmprestimo() == e.getIdEmprestimo()) {
                emprestimo.set(i, e);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se a venda não foi encontrada
    }

    // Remove uma venda pelo ID
    public boolean delete(int id) {
        return emprestimo.removeIf(p -> p.getIdEmprestimo() == id);
    }
}
