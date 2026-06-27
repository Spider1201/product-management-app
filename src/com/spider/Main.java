package com.spider;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductService service = new ProductService();

        service.addProduct(new Product(01, "Dell Latitude E7270","Laptop", "Dell", 2020));
        service.addProduct(new Product(02, "Iphone 11 pro max","Phone", "Iphone", 2020));
        service.addProduct(new Product(03, "Dell External Keyboard","Keyboard", "Dell", 2020));
        service.addProduct(new Product(04, "hp mouse","Mouse", "HP", 2020));
        service.addProduct(new Product(05, "Dell Latitude E7270","Laptop", "Dell", 2020));
        service.addProduct(new Product(06, "VIVO Adaptor","Apaptor", "VIVO", 2020));

        List<Product> products = service.getAllProducts();

        for(Product p : products){
            System.out.println(p);
        }
    }
}
