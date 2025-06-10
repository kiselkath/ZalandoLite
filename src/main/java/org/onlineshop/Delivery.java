package org.onlineshop;

/**
 * Этот класс связывает: (Order - Courier)
 */

public class Delivery {

    private int deliveryId;
    private Order order;
    private Courier courier;
    private String status; // например: "PENDING", "IN_PROGRESS", "DELIVERED"

    public Delivery(int deliveryId, Order order, Courier courier, String status) {
        this.deliveryId = deliveryId;
        this.order = order;
        this.courier = courier;
        this.status = status;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public Order getOrder() {
        return order;
    }

    public Courier getCourier() {
        return courier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", courier=" + courier.getName() +
                ", orderId=" + order.getOrderId() +
                ", status='" + status + '\'' +
                '}';
    }
}
