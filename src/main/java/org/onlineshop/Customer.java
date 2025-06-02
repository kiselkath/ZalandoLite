package org.onlineshop;

import java.util.List;

public class Customer {
    private int id;
    public String name;
    public String email;
    public List<String> favoriteCategories;
    public boolean isVip;

    public Customer(int id, String name, String email, List<String> favoriteCategories, boolean isVip) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.favoriteCategories = favoriteCategories;
        this.isVip = isVip;
    }

    public int getId() {
        return id;
    }
}
