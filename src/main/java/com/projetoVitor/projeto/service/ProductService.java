package com.projetoVitor.projeto.service;

import com.projetoVitor.projeto.entities.Category;
import com.projetoVitor.projeto.entities.Product;
import com.projetoVitor.projeto.repositories.CategoryRepository;
import com.projetoVitor.projeto.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Usuário não encontrado"));
    }

}
