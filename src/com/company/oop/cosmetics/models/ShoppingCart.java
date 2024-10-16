package com.company.oop.cosmetics.models;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products;

    public ShoppingCart() {
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void addProduct(Product product) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void removeProduct(Product product) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
    public boolean containsProduct(Product product) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
    public double totalPrice() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
