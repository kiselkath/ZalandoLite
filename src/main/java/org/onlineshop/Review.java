package org.onlineshop;

/**
 * Описывает один отзыв о товаре
 */

import java.time.LocalDateTime;

public class Review {
    private String author;
    private int rating;
    private String text;
    private LocalDateTime dateTime;

    public Review(String author, int rating, String text) {
        this.author = author;
        this.rating = rating;
        this.text = text;
        this.dateTime = LocalDateTime.now();
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Review: " +
                "author='" + author + '\'' +
                ", rating=" + rating +
                ", text='" + text + '\'' +
                ", dateTime=" + dateTime;
    }
}
