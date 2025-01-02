package com.pa.refatoring.extractclass.employee;

public class Exercicio {
    private String name;
    private String address;
    private double salary;
    private String bankAccount;

    public Exercicio(String name, String address, double salary, String bankAccount) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.bankAccount = bankAccount;
    }

    public void sendPayment() {
        System.out.println("Sending payment of " + salary + " to " + bankAccount);
    }

    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public String getEmployeeDetails() {
        return name + " - " + address;
    }
}
