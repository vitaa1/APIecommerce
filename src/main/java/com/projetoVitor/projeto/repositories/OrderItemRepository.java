package com.projetoVitor.projeto.repositories;

import com.projetoVitor.projeto.entities.OrderItem;
import com.projetoVitor.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
