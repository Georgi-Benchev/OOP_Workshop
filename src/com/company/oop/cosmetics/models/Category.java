package com.company.oop.cosmetics.models;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name should be between 2 and 15 symbols.");
        }
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Category(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        if (products.contains(product)) {
            products.remove(product);
        } else {
            throw new IllegalArgumentException("Product not found in category.");
        }
    }

    public String print() {
        StringBuilder output = new StringBuilder(String.format("#Category %s//n", this.name));

        if (this.products.isEmpty()) {
            output.append(" #No product in this category");
        } else {
            for (Product product : products) {
                output.append(product.print());
            }
        }
        return output.toString();
    }

}
