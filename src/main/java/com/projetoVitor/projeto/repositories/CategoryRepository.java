package com.projetoVitor.projeto.repositories;

import com.projetoVitor.projeto.entities.Category;
import com.projetoVitor.projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
