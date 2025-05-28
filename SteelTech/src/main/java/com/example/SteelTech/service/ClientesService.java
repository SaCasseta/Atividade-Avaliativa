package com.example.SteelTech.service;

import com.example.SteelTech.DTO.ClientesDTO;
import com.example.SteelTech.entity.Clientes;
import com.example.SteelTech.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ClientesService {
    @Autowired
    public ClientesRepository clientesRepository;


    public ClientesDTO cria (ClientesDTO clientesDTO){
        Clientes cliente = new Clientes();
        cliente.setNome(clientesDTO.getNome());
        cliente.setEndereco(clientesDTO.getEndereco());
        cliente.setContato(clientesDTO.getContato());
        cliente.setCpf(clientesDTO.getCpf());
        Clientes ClienteSalvo = clientesRepository.save(cliente);
        return map ToDTO(ClienteSalvo);
    }

}
