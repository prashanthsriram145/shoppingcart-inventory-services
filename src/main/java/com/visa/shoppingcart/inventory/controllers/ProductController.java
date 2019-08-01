package com.visa.shoppingcart.inventory.controllers;

import com.visa.shoppingcart.inventory.entities.Product;
import com.visa.shoppingcart.inventory.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    @ResponseBody()
    public List<Product> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return products;
    }

    @GetMapping("/productsInCategory/{category_name}")
    @ResponseBody
    public List<Product> getAllProductsInCategory(@PathVariable("category_name") String categoryName){
        return productService.getAllProductsInCategory(categoryName);
    }

    @PostMapping("/addProduct")
    public boolean addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public boolean deleteProduct(@PathVariable("productId") String productId){
        return productService.deleteProduct(productId);
    }

}
