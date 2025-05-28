package com.example.SteelTech.repository;

import com.example.SteelTech.entity.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedidos, Long> {
}
