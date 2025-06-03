package org.onlineshop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Что это: Обслуживает создание и хранение заказов.
 *
 * Зачем нужен: Когда клиент заказывает товар, этот класс проверяет наличие товара,
 * уменьшает склад и сохраняет заказ.
 *
 * Метод createOrder(...) — оформляет заказ (с проверкой на наличие товара)
 *
 * Метод getOrdersByCustomer(...) — получает все заказы конкретного клиента
 */

public class OrderManager {
    private InventoryManager inventoryManager;
    private Map<Integer, List<Order>> ordersByCustomer = new HashMap<>();
    private int orderCounter = 1;
    private CustomerManager customerManager;


    public OrderManager(InventoryManager inventoryManager, CustomerManager customerManager) {
        this.inventoryManager = inventoryManager;
        this.customerManager = customerManager;
    }

    public Order createOrder(int customerId, List<OrderItem> items) {
        // Проверка наличия товаров
        for (OrderItem item : items) {
            Product p = item.getProduct();
            if (p.getStock() < item.getQuantity()) {
                System.out.println("Not enough items: " + p.getName());
                return null;
            }
        }

        // Снижаем количество на складе
        for (OrderItem item : items) {
            Product p = item.getProduct();
            p.setStock(p.getStock() - item.getQuantity());
        }

        // Создаём заказ
        Order order = new Order(orderCounter++, customerId, LocalDateTime.now());
        for (OrderItem item : items) {
            order.addItem(item);
        }

        // Добавляем скидку для випов
        Customer customer = customerManager.getCustomerById(customerId);
        boolean isVip = customer != null && customer.isVip();

        double total = 0.0;
        for (OrderItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }

        if (isVip) {
            total *= 0.9; // Скидка 10%
            System.out.println("✨ VIP discount applied! 10% off ✨");
        }

        System.out.printf("\uD83D\uDC9A Total price for order #%d is %.2f%n", order.getOrderId(), total);


        // Сохраняем заказ
        ordersByCustomer.computeIfAbsent(customerId, k -> new ArrayList<>()).add(order);

        //System.out.println("Order completed: " + order);
        return order;
    }

    public List<Order> getOrdersByCustomer(int customerId) {
        return ordersByCustomer.getOrDefault(customerId, new ArrayList<>());
    }
}
