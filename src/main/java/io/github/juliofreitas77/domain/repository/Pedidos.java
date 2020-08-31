package io.github.juliofreitas77.domain.repository;

import io.github.juliofreitas77.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
}
