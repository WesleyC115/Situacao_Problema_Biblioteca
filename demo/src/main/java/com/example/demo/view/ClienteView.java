package com.example.demo.view;

import com.example.demo.controller.ClienteController;
import com.example.demo.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ClienteView {
    ClienteController ct = new ClienteController();

    @GetMapping("/cliente")
    public List<Cliente> getAllClientes(){
        return ct.getAllClientes();
    }

    @PostMapping("/cliente")
    public Boolean postCliente(@RequestBody Cliente c){
        return ct.save(c);
    }
}
