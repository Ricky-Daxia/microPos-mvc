package com.example.posproduct.service;

import com.example.posproduct.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getProducts();

    public Product findByID(long productId);

//    public boolean updateProductQuantityById(long productId, int quantity);
}
