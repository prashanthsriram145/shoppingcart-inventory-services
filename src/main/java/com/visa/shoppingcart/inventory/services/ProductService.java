package com.visa.shoppingcart.inventory.services;

import com.visa.shoppingcart.inventory.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    List<Product> getAllProductsInCategory(String categoryName);

    boolean addProduct(Product product);

    boolean deleteProduct(String productId);
}
