package com.dutradevs.api2.livraria;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroLivros(
        @NotBlank
        String titulo,
        @NotBlank
        String autor,
        @NotNull
        String editora,
        @NotBlank
        @Pattern(regexp = "\\d{2,4}")
        String paginas,
        @NotBlank
        String descricao,
        @NotNull
        Categoria categoria
) {
}
