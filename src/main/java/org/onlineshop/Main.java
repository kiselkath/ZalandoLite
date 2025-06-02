package org.onlineshop;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Создаём инвентарь и наполняем товарами
        InventoryManager inventory = new InventoryManager();

        Product jeans = new Product(1, "Jeans", "Pants", 59.99, 20, List.of("S", "M", "L"));
        Product hoodie = new Product(2, "Hoodie", "Outerwear", 39.99, 15, List.of("M", "L", "XL"));

        inventory.addProduct(jeans);
        inventory.addProduct(hoodie);

        // 2. Регистрируем клиента
        CustomerManager customerManager = new CustomerManager();
        List<String> categories = Arrays.asList("Shoes", "Dresses");
        Customer customer = new Customer(101, "Lena Schmidt", "lenash@example.com", categories, true);
        customerManager.registerCustomer(customer);

        // 3. Оформляем заказ
        OrderManager orderManager = new OrderManager(inventory);

        OrderItem item1 = new OrderItem(jeans, 2);
        OrderItem item2 = new OrderItem(hoodie, 1);

        Order order = orderManager.createOrder(customer.getId(), List.of(item1, item2));

        // 4. Проверка: выводим заказ
        if (order != null) {
            System.out.println("✅ The order has been successfully created: " + order);
        } else {
            System.out.println("❌ Error while creating an order.");
        }

        // 5. Проверка остатков
        System.out.println("📦 Jeans left: " + jeans.getStock());
        System.out.println("📦 Hoodie left: " + hoodie.getStock());

        // 6. Список заказов клиента
        List<Order> orders = orderManager.getOrdersByCustomer(customer.getId());
        System.out.println("📜 Orders of Client ID#" + customer.getId() + ": " + orders);
    }
}
