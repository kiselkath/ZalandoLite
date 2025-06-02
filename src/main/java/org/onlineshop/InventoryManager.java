package org.onlineshop;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product> products;

    public InventoryManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void listAllProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public Product findProductById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
