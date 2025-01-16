package com.projetoVitor.projeto.repositories;

import com.projetoVitor.projeto.entities.Category;
import com.projetoVitor.projeto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
