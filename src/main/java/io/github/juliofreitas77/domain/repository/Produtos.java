package io.github.juliofreitas77.domain.repository;

import io.github.juliofreitas77.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
