package com.example.demo.database;

import com.example.demo.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroDatabase {
    private static LivroDatabase instance;

    // Lista de produtos
    private List<Livro> livros;

    // Construtor privado para evitar a criação de instâncias fora da classe
    private LivroDatabase() {
        this.livros = new ArrayList<>();
    }

    // Método público e estático para obter a instância única
    public static LivroDatabase getInstance() {
        if (instance == null) {
            instance = new LivroDatabase();  // Cria a instância na primeira vez que for chamada
        }
        return instance;
    }

    // Insere um novo produto na lista
    public void insert(Livro l) {
        livros.add(l);
    }

    // Busca um produto pelo ID
    public Livro findOne(Long id) {
        for (Livro l : livros) {
            if (l.getIdLivro() == id) {
                return l;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Livro> findAll() {
        return new ArrayList<>(livros);
    }

    // Atualiza um produto existente na lista
    public boolean update(Livro l) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getIdLivro() == l.getIdLivro()) {
                livros.set(i, l);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(Long id) {
        return livros.removeIf(p -> p.getIdLivro() == id);
    }
}
