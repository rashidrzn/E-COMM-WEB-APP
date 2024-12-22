package com.example.ecom_project.service;

import com.example.ecom_project.model.Product;
import com.example.ecom_project.repo.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductsRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
