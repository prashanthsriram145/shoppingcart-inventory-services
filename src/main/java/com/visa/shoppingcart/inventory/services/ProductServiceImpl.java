package com.visa.shoppingcart.inventory.services;

import com.visa.shoppingcart.inventory.dao.ProductRepository;
import com.visa.shoppingcart.inventory.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public List<Product> getAllProductsInCategory(String categoryName){
        return productRepository.findAllByCategory_CategoryName(categoryName);
    }

    @Override
    public boolean addProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        return savedProduct != null;
    }

    @Override
    public boolean deleteProduct(String productId) {
        productRepository.deleteById(productId);
        return true;
    }
}
