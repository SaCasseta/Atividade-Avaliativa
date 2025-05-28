package com.example.SteelTech.service;

import com.example.SteelTech.DTO.ProdutoDTO;
import com.example.SteelTech.entity.Produto;
import com.example.SteelTech.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public ProdutoDTO criaritem (ProdutoDTO produtoDTO){
        Produto produto = new Produto();
        produto.setTipoMaterial(produtoDTO.getTipoMaterial());
        produto.setEspecificacao(produtoDTO.getEspecificacao());
        produto.setQuantidade(produtoDTO.getQuantidade());
        Produto produtosalvo = ProdutoRepository.save(produto);
        return map ToDTO(produtosalvo);
    }


}
