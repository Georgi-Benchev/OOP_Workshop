package com.company.oop.cosmetics.models;

import java.util.Objects;

public class Product {
    private final int NAME_MAX_LENGTH = 10;
    private final int NAME_MIN_LENGTH = 3;
    private final int PRODUCT_MAX_LENGTH = 10;
    private final int PRODUCT_MIN_LENGTH = 2;
    private String name;
    private String brand;
    private Double price;
    private GenderType gender;
    // "Each product in the system has name, brand, price and gender."

    // Constructor
    public Product(String name, String brand, double price, GenderType gender) {

        setName(name);
        setBrand(brand);
        setPrice(price);
        setGender(gender);
    }



    public void setName(String name) {
        if (name.length() >= NAME_MIN_LENGTH && name.length() <= NAME_MAX_LENGTH) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name should be between 3 and 10 symbols.");
        }
    }

    public void setBrand(String brand) {
        if (brand.length() >= PRODUCT_MIN_LENGTH && brand.length() <= PRODUCT_MAX_LENGTH) {
            this.brand = brand;
        } else {
            throw new IllegalArgumentException("Brand should be between 2 and 10 symbols.");
        }
    }


    public void setGender(GenderType gender) {
        this.gender = gender;
    }


    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price should be non negative.");
        } else {
            this.price = price;
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
                , name, brand, price, gender.toString());
        return output;
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
