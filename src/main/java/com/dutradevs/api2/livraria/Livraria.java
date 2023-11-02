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

    public Livraria(DadosCadastroLivros dados) {
        this.autor = dados.autor();
        this.titulo = dados.titulo();
        this.editora = dados.editora();
        this.paginas = dados.paginas();
        this.descricao = dados.descricao();
        this.categoria = dados.categoria();
    }
}
