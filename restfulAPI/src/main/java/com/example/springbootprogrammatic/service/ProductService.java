package com.example.springbootprogrammatic.service;

import com.example.springbootprogrammatic.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    public Product createProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> updateProduct(Long id, Product updatedProduct) {
        Optional<Product> existingProduct = getProductById(id);
        existingProduct.ifPresent(product -> {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
        });
        return existingProduct;
    }

    public boolean deleteProduct(Long id) {
        return products.removeIf(product -> product.getId().equals(id));
    }
}
