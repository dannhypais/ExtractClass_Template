package com.pa.refatoring.extractclass.order;

import java.util.List;

public class Exercicio {
    private int orderId;
    private List<String> items;
    private double totalAmount;
    private String deliveryAddress;
    private String deliveryStatus;

    public Exercicio(int orderId, List<String> items, double totalAmount, String deliveryAddress) {
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = "Pending";
    }

    public void updateDeliveryAddress(String newAddress) {
        this.deliveryAddress = newAddress;
    }

    public void updateDeliveryStatus(String status) {
        this.deliveryStatus = status;
    }

    public double calculateTotal() {
        return totalAmount;
    }

    public String getOrderDetails() {
        return "Order #" + orderId + ": " + items.toString();
    }
}
