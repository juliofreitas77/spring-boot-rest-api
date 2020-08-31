package io.github.juliofreitas77.domain.repository;

import io.github.juliofreitas77.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
