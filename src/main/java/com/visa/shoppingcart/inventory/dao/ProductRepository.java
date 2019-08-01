package com.visa.shoppingcart.inventory.dao;

import com.visa.shoppingcart.inventory.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,String> {

    List<Product> findAllByCategory_CategoryName(String categoryName);

}
