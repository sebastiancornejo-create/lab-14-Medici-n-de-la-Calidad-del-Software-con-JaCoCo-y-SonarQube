package com.tecsup.minishop.controller;

import com.tecsup.minishop.model.Product;
import com.tecsup.minishop.service.ProductService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

    @Test
    void shouldCreateAndListProducts() {
        ProductController controller = new ProductController(new ProductService());
        controller.create(new Product(1L, "Mouse", 80.0));

        assertEquals(1, controller.list().size());
    }
}