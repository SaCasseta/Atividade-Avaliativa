package com.example.SteelTech.DTO;

import com.example.SteelTech.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstoqueDTO {

    private long idEstoque;

    private Produto produtos;

    private int quantidadeMaterial;

    private int quantidadeProdutosFinalizados;

    private LocalDateTime ultimaAt;
}
