package com.projetoVitor.projeto.service;

import com.projetoVitor.projeto.entities.Category;
import com.projetoVitor.projeto.entities.Order;
import com.projetoVitor.projeto.repositories.CategoryRepository;
import com.projetoVitor.projeto.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Usuário não encontrado"));
    }

}
