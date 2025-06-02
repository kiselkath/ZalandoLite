## 📅 **Progress – Day 1: Foundations Built**

Today the basic backend structure was implemented for the **ZalandoLite** project — a simplified online clothing store. Below are the added classes and their purposes.

---
### 🏪 **Current Store Capabilities**

As of today, the store can:

* 📦 Store and display products with sizes and stock counts
* 👤 Register customers with favorite categories and VIP status
* 🛍️ Create orders with items and timestamps
* 🔍 Lookup customers and products by ID
* 📋 Display order details including contents

---

### ✅ **Created Classes**

#### 🧾 `Product.java`

> Represents a product. Contains fields:

* `id`, `name`, `category`, `price`, `stock`
* `availableSizes` (list of sizes, e.g., `"S"`, `"M"`, `"L"`)

#### 📦 `InventoryManager.java`

> Manages the store’s product collection:

* Add product
* Find product by ID
* List all products

#### 👤 `Customer.java`

> Represents a customer:

* `id`, `name`, `email`
* `favoriteCategories` (list of preferred categories)
* `isVip` (VIP status flag, annotated with `@VIP`)

#### 🗂️ `CustomerManager.java`

> Manages customers:

* Register customer
* Get customer by ID
* Uses `Map<Integer, Customer>` for fast lookup

#### 🛒 `OrderItem.java`

> Represents an order line item:

* `Product product`
* `int quantity`

#### 📑 `Order.java`

> Represents an order:

* `orderId`, `customerId`, `timestamp`
* List of `OrderItem` objects

---

### 🧪 **Smoke Test in `Main.java`**

A simple smoke test in `Main.java` demonstrates the basic workflow:

* Creating products and adding them to inventory
* Registering a customer
* Creating an order with multiple items
* Displaying:

    * All products
    * Order details
    * Customer info

✅ This confirms core functionalities work: storage, entity relationships, and data output.

---



### ⏭️ **Next Steps (Day 2)**

* Stock validation and deduction when ordering
* Extend delivery model (couriers, statuses)
* Reflection and VIP discounts
* File I/O (read/write)
* Unit testing with JUnit

---

---
## 📅 **Прогресс – День 1: Основы построены**

Сегодня была реализована базовая структура backend-системы для проекта **ZalandoLite** – облегчённой версии онлайн-магазина одежды. Ниже перечислены добавленные классы и их назначение.

---

### ✅ **Созданные классы**

#### 🧾 `Product.java`

> Модель товара. Содержит поля:

* `id`, `name`, `category`, `price`, `stock`
* `availableSizes` (список размеров, напр. `"S"`, `"M"`, `"L"`)

#### 📦 `InventoryManager.java`

> Управление списком товаров в магазине:

* Добавление товара
* Поиск по ID
* Вывод всех товаров

#### 👤 `Customer.java`

> Модель покупателя:

* `id`, `name`, `email`
* `favoriteCategories` (любимые категории товаров)
* `isVip` (флаг VIP-клиента с аннотацией `@VIP`)

#### 🗂️ `CustomerManager.java`

> Управление клиентами:

* Регистрация клиента
* Поиск клиента по ID
* Использует `Map<Integer, Customer>` для быстрого доступа

#### 🛒 `OrderItem.java`

> Представляет позицию в заказе:

* `Product product`
* `int quantity`

#### 📑 `Order.java`

> Модель заказа:

* `orderId`, `customerId`, `timestamp`
* Список объектов `OrderItem`

---

### 🧪 **Тест в `Main.java` (smoke test)**

В классе `Main.java` реализован простой smoke-тест, демонстрирующий базовый цикл взаимодействия:

* Создание товаров и добавление в инвентарь
* Регистрация клиента
* Создание заказа с двумя товарами
* Вывод информации:

    * Все товары
    * Заказ и его состав
    * Клиентская информация

✅ Это подтверждает корректность работы основных операций: хранения, связи между сущностями и вывода данных.

---

### 🏪 **Текущее состояние функционала "магазина"**

На сегодняшний день наш магазин может:

* 📦 Хранить и отображать список товаров с размерами и остатками
* 👤 Регистрировать клиентов с любимыми категориями и VIP-статусом
* 🛍️ Создавать заказы с позициями и временем оформления
* 🔍 Находить клиентов и товары по ID
* 📋 Демонстрировать заказ с деталями

---

### ⏭️ **Следующие шаги (День 2)**

* Проверка остатков и вычитание при заказе
* Расширение модели доставки (курьеры, статусы)
* Рефлексия и скидки для VIP
* Чтение/запись в файл
* Тестирование с JUnit
