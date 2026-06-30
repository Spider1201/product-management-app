package com.spider;

public class Product {
    private String name;
    private String type;
    private String brand;
    private int warranty;

    public Product( String name, String type, String brand, int warranty) {
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.warranty = warranty;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", warranty=" + warranty +
                '}';
    }
}
