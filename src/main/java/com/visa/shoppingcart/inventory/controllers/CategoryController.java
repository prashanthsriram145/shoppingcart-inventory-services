package com.visa.shoppingcart.inventory.controllers;

import com.visa.shoppingcart.inventory.entities.Category;
import com.visa.shoppingcart.inventory.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory/v1/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    @ResponseBody
    public List<Category> getAllCategories(){
        List<Category> categories = categoryService.getAllCategories();
        return categories;
    }

    @PostMapping(path="/addCategory", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public boolean addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

}
