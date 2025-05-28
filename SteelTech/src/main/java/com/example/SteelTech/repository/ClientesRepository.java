package com.example.SteelTech.repository;

import com.example.SteelTech.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
