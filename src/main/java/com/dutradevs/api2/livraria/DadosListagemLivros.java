package com.dutradevs.api2.livraria;

public record DadosListagemLivros(Long id, String titulo, String autor, String editora, String paginas, String descricao, Categoria categoria) {

    public DadosListagemLivros(Livraria livraria) {
        this(livraria.getId(), livraria.getTitulo(), livraria.getAutor(), livraria.getEditora(), livraria.getPaginas(), livraria.getDescricao(), livraria.getCategoria());
    }
}
