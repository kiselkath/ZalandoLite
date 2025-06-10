package org.onlineshop;

/**
 * Управляет отзывами по каждому продукту
 */

import java.util.*;

public class ReviewManager {
    private Map<Integer, List<Review>> reviewsByProductId = new HashMap<>();

    //Добавить review к продукту с заданным productId в структуру Map<Integer, List<Review>> reviewsByProductId
    public void addReview(int productId, Review review) {
        reviewsByProductId.computeIfAbsent(productId, k -> new ArrayList<>()).add(review);
        System.out.println("Review added for product ID " + productId);
    }

    public List<Review> getReviewsForProduct(int productId) {
        return reviewsByProductId.getOrDefault(productId, new ArrayList<>());
    }
}
