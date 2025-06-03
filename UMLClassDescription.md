## 📦 UML: Классы и Ассоциации

Ниже описаны классы, их основные поля, методы и отношения (ассоциации) между ними для построения UML-диаграммы классов.

---

### 🧥 `Product`

* **Поля:**

    * `int id`
    * `String name`
    * `String category`
    * `double price`
    * `int stock`
    * `List<String> availableSizes`
* **Методы:** геттеры, сеттеры, конструктор, `toString()`

**Ассоциации:**

* Используется в `OrderItem`
* Управляется через `InventoryManager`

---

### 📦 `InventoryManager`

* **Поля:**

    * `List<Product> products`
* **Методы:**

    * `addProduct(Product)`
    * `findProductById(int)`
    * `listAllProducts()`

**Ассоциации:**

* Агрегирует `Product`

---

### 👤 `Customer`

* **Поля:**

    * `int id`
    * `String name`
    * `String email`
    * `List<String> favoriteCategories`
    * `boolean isVip`
* **Методы:** геттеры, сеттеры, `toString()`

**Ассоциации:**

* Используется в `Order` (по ID)
* Управляется через `CustomerManager`

---

### 🧾 `CustomerManager`

* **Поля:**

    * `Map<Integer, Customer> customerMap`
* **Методы:**

    * `registerCustomer(Customer)`
    * `getCustomerById(int)`

**Ассоциации:**

* Агрегирует `Customer`

---

### 📄 `OrderItem`

* **Поля:**

    * `Product product`
    * `int quantity`
* **Методы:** геттеры, конструктор, `toString()`

**Ассоциации:**

* Композится в `Order`
* Агрегирует `Product`

---

### 🛒 `Order`

* **Поля:**

    * `int orderId`
    * `int customerId`
    * `LocalDateTime timestamp`
    * `List<OrderItem> items`
* **Методы:** геттеры, конструктор, `toString()`

**Ассоциации:**

* Композирует `OrderItem`
* Ссылается на `Customer` по ID

---

### 📑 `OrderManager` *(опционально)*

* Будет агрегировать `Order`, обрабатывать заказы, проверять `Inventory`

**Ассоциации:**

* Связан с `Customer`, `InventoryManager`, `Order`

---

## 🔗 Сводная Таблица Ассоциаций

| Класс        | Ассоциирован с           | Тип ассоциации   |
| ------------ | ------------------------ | ---------------- |
| Product      | OrderItem                | Aggregation      |
| Product      | InventoryManager         | Aggregation      |
| Customer     | Order (по ID)            | Association (ID) |
| Customer     | CustomerManager          | Aggregation      |
| OrderItem    | Product                  | Aggregation      |
| Order        | OrderItem                | Composition      |
| Order        | Customer (по ID)         | Association (ID) |
| OrderManager | Order, Product, Customer | Aggregation      |
