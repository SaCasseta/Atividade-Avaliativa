package com.example.SteelTech.DTO;

import com.example.SteelTech.entity.Clientes;
import com.example.SteelTech.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidosDTO {

    private long idPedido;

    private Clientes cliente;

    private List<Produto> produtos;

    private LocalDateTime data;

    private String status;

    private int totalQuantidade;
}
