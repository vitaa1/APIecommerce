package com.projetoVitor.projeto.service;

import com.projetoVitor.projeto.entities.Category;
import com.projetoVitor.projeto.entities.Product;
import com.projetoVitor.projeto.repositories.CategoryRepository;
import com.projetoVitor.projeto.repositories.ProductRepository;
import com.projetoVitor.projeto.service.exceptions.DataBaseException;
import com.projetoVitor.projeto.service.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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

    public Product insert(Product obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        try {
            if (!repository.existsById(id)) {
                throw new ResourceNotFoundException(id);
            }
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataBaseException(e.getMessage());
        }
    }

    public Product update(Long id, Product obj) {
        try {
            Product product = repository.getReferenceById(id);
            updateDate(product, obj);
            return repository.save(product);
        } catch (EntityNotFoundException e) {
            throw  new ResourceNotFoundException(id);
        }
    }

    private void updateDate(Product product, Product obj) {
        product.setName(obj.getName());
        product.setDescription(obj.getDescription());
        product.setPrice(obj.getPrice());
        product.setImgUrl(obj.getImgUrl());
    }

}
