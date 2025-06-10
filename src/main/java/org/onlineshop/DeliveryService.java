package org.onlineshop;

import java.util.ArrayList;
import java.util.List;

/**
 * Этот класс:
 * Назначает свободного курьера на заказ
 * Обновляет статус доставки
 */

public class DeliveryService {
    private List<Courier> couriers = new ArrayList<>();
    private List<Delivery> deliveries = new ArrayList<>();
    private int nextDeliveryId = 1;

    public void registerCourier(Courier courier) {
        couriers.add(courier);
    }

    public Delivery assignCourierToOrder(Order order) {
        for (Courier courier : couriers) {
            if (courier.isAvailable()) {
                courier.toggleAvailability(); // теперь он занят
                Delivery delivery = new Delivery(nextDeliveryId++, order, courier, "IN_PROGRESS");
                deliveries.add(delivery);
                System.out.println("Courier assigned: " + courier.getName());
                return delivery;
            }
        }
        System.out.println("No available courier.");
        return null;
    }

    public void updateDeliveryStatus(Delivery delivery, String newStatus) {
        delivery.setStatus(newStatus);
        if ("DELIVERED".equalsIgnoreCase(newStatus)) {
            delivery.getCourier().toggleAvailability(); // курьер снова доступен
        }
        System.out.println("Delivery updated: " + delivery);
    }

    public List<Delivery> getAllDeliveries() {
        return deliveries;
    }
}
