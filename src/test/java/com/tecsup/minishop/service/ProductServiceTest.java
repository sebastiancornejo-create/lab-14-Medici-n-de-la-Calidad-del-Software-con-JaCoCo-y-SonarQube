package com.tecsup.minishop.service;

import com.tecsup.minishop.model.Product;

class ProductServiceTest {

    @Test
    void shouldSaveValidProduct() {
        ProductService service = new ProductService();
        Product laptop = ((Object) Product.builder()).id(1L).name("Laptop").price(2500.0).build();
        Product saved = service.save(laptop);
        assertEquals("Laptop", saved.getName());
        assertEquals(1, service.count());
    }

    private void assertEquals(int i, int count) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    private void assertEquals(String string, int name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}