package com.pa.refatoring.extractclass.employee;

public class Employee {
    private String name;
    private String address;
    private Payroll payroll;

    public Employee(String name, String address, double salary, String bankAccount) {
        this.name = name;
        this.address = address;
        this.payroll = new Payroll(salary, bankAccount);
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public String getEmployeeDetails() {
        return name + " - " + address;
    }

    public void sendPayment() {
        payroll.processPayment();
    }
}
