package com.example.SteelTech.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientesDTO {

    private long idCliente;

    private String nome;

    private String cpf;

    private String endereco;

    private String contato;
}
