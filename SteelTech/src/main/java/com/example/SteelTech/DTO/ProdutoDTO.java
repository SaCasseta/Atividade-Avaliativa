package com.example.SteelTech.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {
    private long idProduto;

    private String nome ;

    private String tipoMaterial;

    private String especificacao;

    private int quantidade;
}
