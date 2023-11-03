package com.dutradevs.api2.controller;

import com.dutradevs.api2.livraria.DadosCadastroLivros;
import com.dutradevs.api2.livraria.DadosListagemLivros;
import com.dutradevs.api2.livraria.Livraria;
import com.dutradevs.api2.livraria.LivrariaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public Page<DadosListagemLivros> listar(@PageableDefault(size = 10, sort = "categoria") Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemLivros::new);
    }
}
