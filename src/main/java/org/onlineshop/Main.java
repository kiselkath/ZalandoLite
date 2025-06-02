package org.onlineshop;

import org.onlineshop.Product;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sizes = Arrays.asList("S", "M", "L");
        Product shirt = new Product(1, "T-shirt", "Clothing", 25.99, 50, sizes);
        System.out.println(shirt);
    }
}
