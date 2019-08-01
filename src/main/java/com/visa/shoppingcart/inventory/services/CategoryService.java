package com.visa.shoppingcart.inventory.services;

import com.visa.shoppingcart.inventory.entities.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> getAllCategories();

    public boolean addCategory(Category category);
}
