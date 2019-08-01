package com.visa.shoppingcart.inventory.services;

import com.visa.shoppingcart.inventory.dao.CategoryRepository;
import com.visa.shoppingcart.inventory.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }

    @Override
    public boolean addCategory(Category category) {
        Category savedCategory = categoryRepository.save(category);
        return savedCategory!= null;
    }
}
