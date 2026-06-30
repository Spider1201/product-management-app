package com.spider;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductService service = new ProductService();

//        service.addProduct(new Product( "Dell Latitude E7270","Laptop", "Dell", 2020));
//        service.addProduct(new Product( "Iphone 11 pro max","Phone", "Iphone", 2020));
//        service.addProduct(new Product( "Momofly 2160","Phone", "Momofly", 2020));
//        service.addProduct(new Product( "Dell External Keyboard","Keyboard", "Dell", 2020));
//        service.addProduct(new Product( "hp mouse","Mouse", "HP", 2020));
//        service.addProduct(new Product( "Bush Smart TV","Television", "Bush", 2020));
//        service.addProduct(new Product ("VIVO Adaptor","Apaptor", "VIVO", 2020));

        List<Product> products = service.getAllProducts();

        for(Product p : products){
            System.out.println(p);
        }
//
//        System.out.println("==================================================");
//
//        System.out.println("a Particular product");
//        Product p = service.getProduct("hp mouse");
//        System.out.println(p);
//
//        System.out.println("==================================================");
//        System.out.println("Searched by Brand");
//        Product pb = service.getProductByBrand("Dell");
//        System.out.println(pb);
//
//        System.out.println("==================================================");
//        System.out.println("Searched by type");
//        Product pt = service.getProductByType("Phone");
//        System.out.println(pt);
//
//        System.out.println("==================================================");
//        System.out.println("Search by");
//        List<Product> prods = service.getProductWithText("Dell");
//        for(Product product : prods){
//            System.out.println(product);
//        }

    }
}
