package com.test.doancuoiki.service;

import com.test.doancuoiki.entity.Product;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingService {
    void addProduct(Product product);
    void removeProduct(Product product);
    void clearProducts();
    Map<Product, Integer> productsInCart();
    BigDecimal totalPrice();
    void cartCheckout();
}
