package com.example.SteelTech.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedido;

    @OneToMany(mappedBy = "Pedidos", cascade = CascadeType.ALL, orphanRemoval = true)
    private Clientes cliente;

    @ManyToMany
    private List<Produto> produtos;

    private LocalDateTime data;

    private String status;

    private int totalQuantidade;

}
