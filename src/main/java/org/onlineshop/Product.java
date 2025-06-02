package org.onlineshop;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stock;
    private List<String> availableSizes;


    public Product(int id, String name, String category, double price, int stock, List<String> availableSizes) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.availableSizes = availableSizes;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public List<String> getAvailableSizes() {
        return availableSizes;
    }

    public void setAvailableSizes(List<String> availableSizes) {
        this.availableSizes = availableSizes;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", category = '" + category + '\'' +
                ", price = " + price +
                ", stock = " + stock +
                ", availableSizes = " + availableSizes +
                '}';
    }
}
