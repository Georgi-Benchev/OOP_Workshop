package com.company.oop.cosmetics.models;

import java.util.Objects;

public class Product {

    public static final int NAME_MIN_LENGTH = 3;
    public static final int NAME_MAX_LENGTH = 10;
    public static final int BRAND_MIN_LENGTH = 2;
    public static final int BRAND_MAX_LENGTH = 10;

    // "Each product in the system has name, brand, price and gender."

    public Product(String name, String brand, double price, GenderType gender) {
        // finish the constructor and validate data
        setPrice(price);
    }

    public void setPrice(double price) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String getBrand() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public GenderType getGender() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String print() {
        throw new UnsupportedOperationException("Not implemented yet.");
        // Format:
        //" #[Name] [Brand]
        // #Price: [Price]
        // #Gender: [Gender]
        // ==="
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Product product = (Product) p;
        return Double.compare(this.getPrice(), product.getPrice()) == 0 &&
                Objects.equals(this.getName(), product.getName()) &&
                Objects.equals(this.getBrand(), product.getBrand()) &&
                this.getGender() == product.getGender();
    }
    
}
