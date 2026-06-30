package com.spider;

import java.util.List;
import java.util.ArrayList;

public class ProductService {
    List<Product> products = new ArrayList<>();
    ProductDB db = new ProductDB();

    public void addProduct(Product p){
        db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.getAll();
    }



    public Product getProduct(String name) {
        for(Product p : products){
            if(p.getName().equals(name)){
                return p;
            }

        }
        return null;
    }

    public Product getProductByBrand(String brand) {
        for(Product pb : products){
            if(pb.getBrand().equals(brand)){
                return pb;
            }
        }
        return null;
    }

    public Product getProductByType(String type) {
        for(Product pt : products){
           if(pt.getType().equals(type)){
               return pt;
           }
        }
        return null;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for (Product p : products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String brand = p.getBrand().toLowerCase();

            if (name.contains(str) || type.contains(str) || brand.contains(str)) {
                prods.add(p);
            }
        }

        return prods;
    }
}
