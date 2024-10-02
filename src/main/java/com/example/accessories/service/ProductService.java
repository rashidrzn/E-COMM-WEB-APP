package com.example.accessories.service;
import com.example.accessories.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<>( Arrays.asList(new Product(101,"laptop",5000),new Product(102,"macbook", 25000)));

    public List<Product> getProduct(){
        return products;
    }
    public Product getProductById(int prodId){
        for (Product product: products){
            if (product.getProdId() == prodId){
                return product;
            }
        }
        return new Product(100,"noitem",11111);
    }
    public void addproduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product){
        for (int i = 0 ; i< products.size();i++){
            if (products.get(i).getProdId() == product.getProdId()){
                products.set(i,product);
            }
        }
    }
    public void deleteProduct(int prodId){
        for (Product p : products){
            if (p.getProdId() == prodId){
                products.remove(p);
            }
        }
    }
}
