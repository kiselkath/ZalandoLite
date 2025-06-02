package org.onlineshop;

/**
 * Что это: Связка одного товара и его количества.
 * Зачем нужен: Используется в заказе — чтобы указать, какие именно товары и в каком количестве клиент покупает.
 * Содержит:
 * @product
 * @quantity
 */
public class OrderItem {
    private Product product;     // товар
    private int quantity;        // количество

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity + " x " + product.getName() + " (ID: " + product.getId() + ")";
    }
}
