package com.projetoVitor.projeto.service;

import com.projetoVitor.projeto.entities.Order;
import com.projetoVitor.projeto.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Usuário não encontrado"));
    }

}
