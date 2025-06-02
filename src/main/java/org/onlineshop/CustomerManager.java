package org.onlineshop;

import java.util.HashMap;
import java.util.Map;

/**
 * Что это: Управляющий клиентами: регистрация, поиск, хранение.
 * Зачем нужен: Позволяет быстро находить клиента по ID. Это нужно при создании заказа, отправке email и т.д.
 */

public class CustomerManager {

    // Карта клиентов по ID
    private static Map<Integer, Customer> customerMap = new HashMap<>();

    public static void registerCustomer(Customer c) {
        if (c == null) return;
        customerMap.put(c.getId(), c);
    }

    public static Customer getCustomerById(int id) {
        return customerMap.get(id);
    }

}
