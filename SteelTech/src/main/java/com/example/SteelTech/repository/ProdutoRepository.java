package com.example.SteelTech.repository;

import com.example.SteelTech.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
