package com.pa.refatoring.extractclass.employee;

public class Payroll {
    private double salary;
    private String bankAccount;

    public Payroll(double salary, String bankAccount) {
        this.salary = salary;
        this.bankAccount = bankAccount;
    }

    public void processPayment() {
        System.out.println("Sending payment of " + salary + " to " + bankAccount);
    }
}
