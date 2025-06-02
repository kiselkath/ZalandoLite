package org.onlineshop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private int customerId;
    private LocalDateTime timestamp;
    private List<OrderItem> items;

    public Order(int orderId, int customerId, LocalDateTime timestamp) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.timestamp = timestamp;
        this.items = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        if (item != null) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Order #" + orderId + " (Customer ID: " + customerId + ", Time: " + timestamp + ", Items: " + items + ")";
    }
}
