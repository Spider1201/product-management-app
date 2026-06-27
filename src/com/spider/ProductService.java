package com.spider;

import java.util.List;
import java.util.ArrayList;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts() {
        return products;
    }



}
