package com.example.demo.view;

import com.example.demo.controller.LivroController;
import com.example.demo.model.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivroView {

    LivroController lc = new LivroController();

    @GetMapping("/produto")
    public List<Livro> getAllLivro() {
        return lc.getAllLivros();
    }

    @PostMapping("/produto")
    public Boolean postProduto(@RequestBody Livro l) {
        return lc.save(l);
    }
}