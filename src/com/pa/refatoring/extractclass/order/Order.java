package com.pa.refatoring.extractclass.order;

import java.util.List;

public class Order {
    private int orderId;
    private List<String> items;
    private double totalAmount;
    private Delivery delivery;
    public Order(int orderId, List<String> items, double totalAmount, String deliveryAddress) {
        this.delivery = new Delivery(deliveryAddress);
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
    }
    public void updateDeliveryAddress(String newAddress) { delivery.setDeliveryAddress(newAddress); }

    public void updateDeliveryStatus(String status) {
        delivery.setDeliveryStatus(status);
    }

    public double calculateTotal() {
        return totalAmount;
    }

    public String getOrderDetails() {
        return "Order #" + orderId + ": " + items.toString();
    }
}
