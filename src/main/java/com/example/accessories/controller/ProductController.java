package com.example.accessories.controller;

import com.example.accessories.model.Product;
import com.example.accessories.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProduct();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @PostMapping("/products")
     public void addProduct(@RequestBody Product product){
        System.out.println(product);
         productService.addproduct(product);
     }

     @PutMapping("/products")
     public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
     }

     @DeleteMapping("/products/{prodId}")
     public void deleteProduct(@PathVariable int prodId){
        productService.deleteProduct(prodId);
     }
}
