package io.github.juliofreitas77.domain.repository;

import io.github.juliofreitas77.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<Cliente, Integer> {
}
