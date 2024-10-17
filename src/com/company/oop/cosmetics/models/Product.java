package com.company.oop.cosmetics.models;

import java.util.Objects;

public class Product {
    private final String name;
    private final String brand;
    private Double price;
    private final GenderType gender;
    // "Each product in the system has name, brand, price and gender."

    public Product(String name, String brand, double price, GenderType gender) {
        if (name.length() >= 3 && name.length() <= 10) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Name should be between 3 and 10 symbols.");
        }

        if (brand.length() >= 2 && brand.length() <= 10) {
            this.brand = brand;
        }else {
            throw new IllegalArgumentException("Brand should be between 2 and 10 symbols.");
        }

        setPrice(price);
        this.gender = gender;
    }

    public void setPrice(double price) {
        if (price<0){
            throw new IllegalArgumentException("Price should be non negative.");
        }else {
            this.price=price;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public GenderType getGender() {
        return gender;
    }

    public String print() {
        String output = String.format(
                " #[%s] [%s]//n #Price: [%.2f]//n #Gender: [%s]//n ==="  // not sure about the === ???
                ,name,brand,price,gender.toString());
        return output;
     /*   throw new UnsupportedOperationException("Not implemented yet.");
        // Format:
        // #[Name] [Brand]
        // #Price: [Price]
        // #Gender: [Gender]
        // ==="*/
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
