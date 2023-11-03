package com.dutradevs.api2.livraria;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoLivros(
        @NotNull
        Long id,
        String titulo,
        String autor,
        String editora,
        String paginas,
        String descricao,
        Categoria categoria
) {
}
