package com.felliperocha.academia.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NotNull(message = "O Campo 'nome' é obrigatório")
    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Exercicio> exercicios = new ArrayList<>();
}
