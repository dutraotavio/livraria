package com.dutradevs.api2.controller;

import com.dutradevs.api2.livraria.DadosCadastroLivros;
import com.dutradevs.api2.livraria.Livraria;
import com.dutradevs.api2.livraria.LivrariaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livraria")
public class LivrariaController {

    @Autowired
    private LivrariaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroLivros dados) {
        repository.save(new Livraria(dados));
    }
}
