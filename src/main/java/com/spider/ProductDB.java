package com.spider;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    Connection conn = null;

    public ProductDB(){
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/spider", "postgres", "Olaseni12");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void save(Product p) {
        String query = "insert into product (name, type, brand, warranty) values(?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, p.getName());
            st.setString(2, p.getType());
            st.setString(3, p.getBrand());
            st.setInt(4, p.getWarranty());
            st.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();

        String query = "select name, type, brand, warranty from product";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setName(rs.getString(1));
                p.setType(rs.getString(2));
                p.setBrand(rs.getString(3));
                p.setWarranty(rs.getInt(4));
                products.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
}
