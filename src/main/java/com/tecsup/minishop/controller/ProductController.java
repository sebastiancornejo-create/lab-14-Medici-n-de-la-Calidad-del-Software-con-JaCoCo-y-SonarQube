package com.tecsup.minishop.controller;

import com.tecsup.minishop.model.Product;
import com.tecsup.minishop.service.ProductService;
import java.util.List;

public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public Product create(Product product) {
        return productService.save(product);
    }

    public List<Product> list() {
        return productService.findAll();
    }
}