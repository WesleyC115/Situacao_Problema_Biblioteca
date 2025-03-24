package com.example.demo.database;

import com.example.demo.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDatabase {
    private static ClienteDatabase instance;

    // Lista de clientes
    private List<Cliente> clientes;

    // Construtor privado para impedir a criação de instâncias fora da classe
    private ClienteDatabase() {
        this.clientes = new ArrayList<>();
    }

    // Método público e estático para obter a instância única
    public static ClienteDatabase getInstance() {
        if (instance == null) {
            instance = new ClienteDatabase();  // Cria a instância na primeira vez que for chamada
        }
        return instance;
    }

    // Insere um novo cliente na lista
    public void insert(Cliente cl) {
        clientes.add(cl);
    }

    // Busca um cliente pelo ID
    public Cliente findOne(Long id) {
        for (Cliente cl : clientes) {
            if (cl.getIdCliente() == id) {
                return cl;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os clientes cadastrados
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    // Atualiza um cliente existente na lista
    public boolean update(Cliente cl) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente() == cl.getIdCliente()) {
                clientes.set(i, cl);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o cliente não foi encontrado
    }

    // Remove um cliente pelo ID
    public boolean delete(Long id) {
        return clientes.removeIf(c -> c.getIdCliente() == id);
    }
}
