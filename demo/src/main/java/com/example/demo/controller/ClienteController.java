package com.example.demo.controller;

import com.example.demo.database.ClienteDatabase;
import com.example.demo.model.Cliente;

import java.util.List;

public class ClienteController {

    ClienteDatabase bcc = ClienteDatabase.getInstance();
    public List<Cliente> getAllClientes() {
        return bcc.findAll();
    }

    public Boolean save(Cliente c) {
        bcc.insert(c);
        return true;
    }
}
