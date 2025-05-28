package com.example.SteelTech.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEstoque;

    @OneToOne
    private Produto produtos;

    private int quantidadeMaterial;

    private int quantidadeProdutosFinalizados;

    private LocalDateTime ultimaAt;

}
