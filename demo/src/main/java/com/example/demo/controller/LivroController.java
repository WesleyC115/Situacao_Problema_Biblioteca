package com.example.demo.controller;

import com.example.demo.database.LivroDatabase;
import com.example.demo.model.Livro;

import java.util.List;

public class LivroController {
    LivroDatabase bcl = LivroDatabase.getInstance();

    public List<Livro> getAllLivros() {
        return bcl.findAll();
    }

    public Boolean save(Livro l) {
        bcl.insert(l);
        return true;
    }
}
