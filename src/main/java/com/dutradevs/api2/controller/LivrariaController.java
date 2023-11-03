package com.dutradevs.api2.controller;

import com.dutradevs.api2.livraria.*;
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

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoLivros dados) {
        var livros = repository.getReferenceById(dados.id());
        livros.atualizarInformacoes(dados);
    }
}
