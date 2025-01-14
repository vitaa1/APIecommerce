package com.projetoVitor.projeto.repositories;

import com.projetoVitor.projeto.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
