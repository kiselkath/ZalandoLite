package org.onlineshop;

import java.time.LocalDateTime;

public class Order {
    public int orderId;
    public int customerId;
    public LocalDateTime timestamp;

    public Order(int orderId, int customerId, LocalDateTime timestamp) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.timestamp = timestamp;
    }
}

