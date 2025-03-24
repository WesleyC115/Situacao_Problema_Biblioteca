package com.example.demo.view;

import com.example.demo.controller.EmprestimoController;
import com.example.demo.model.Emprestimo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmprestimoView {

    EmprestimoController ct = new EmprestimoController();

    @GetMapping("/venda")
    public List<Emprestimo> getAllLivros(){
        return ct.getAllEmprestimos();
    }

    @PostMapping("/venda")
    public Boolean postVendas(@RequestBody Emprestimo e){
        return ct.save(e);
    }
}
