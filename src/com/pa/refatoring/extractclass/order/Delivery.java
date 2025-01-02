package com.pa.refatoring.extractclass.order;

import java.util.List;

public class Delivery {
    private String deliveryAddress;
    private String deliveryStatus;
    public Delivery(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        this.deliveryStatus = "Pending";
    }
    public void setDeliveryAddress(String newAddress) {
        this.deliveryAddress = newAddress;
    }

    public void setDeliveryStatus(String status) {
        this.deliveryStatus = status;
    }
}
