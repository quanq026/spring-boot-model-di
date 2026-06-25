package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Laptop", 15000000));
        products.add(new Product(2, "Phone", 8000000));
        products.add(new Product(3, "Tablet", 5000000));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
