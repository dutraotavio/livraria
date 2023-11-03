package com.dutradevs.api2.livraria;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "livros")
@Entity(name = "Livraria")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Livraria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String editora;
    private String paginas;
    private String descricao;
    @Enumerated(value = EnumType.STRING)
    private Categoria categoria;
    private boolean disponivel;

    public Livraria(DadosCadastroLivros dados) {
        this.titulo = dados.titulo();
        this.autor = dados.autor();
        this.editora = dados.editora();
        this.paginas = dados.paginas();
        this.descricao = dados.descricao();
        this.categoria = dados.categoria();
        this.disponivel = true;
    }

    public void atualizarInformacoes(DadosAtualizacaoLivros dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.autor() != null) {
            this.autor = dados.autor();
        }
        if (dados.editora() != null) {
            this.editora = dados.editora();
        }
        if (dados.paginas() != null) {
            this.paginas = dados.paginas();
        }
        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if (dados.categoria() != null) {
            this.categoria = dados.categoria();
        }
    }

    public void excluir() {
        this.disponivel = false;
    }
}
