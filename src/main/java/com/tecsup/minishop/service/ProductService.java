package com.tecsup.minishop.service;

import com.tecsup.minishop.model.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public Product save(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        if (product.getName() <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero");
        }
        products.add(product);
        return product;
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }

    public int count() {
        return products.size();
    }
}