package com.visa.shoppingcart.inventory.dao;

import com.visa.shoppingcart.inventory.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
