package org.onlineshop;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String email;
    private List<String> favoriteCategories;
    private boolean isVip;

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

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getFavoriteCategories() {
        return favoriteCategories;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setFavoriteCategories(List<String> favoriteCategories) {
        this.favoriteCategories = favoriteCategories;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", email = '" + email + '\'' +
                ", favoriteCategories = " + favoriteCategories +
                ", isVip = " + isVip;
    }
}
