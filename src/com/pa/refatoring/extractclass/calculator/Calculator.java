package com.pa.refatoring.extractclass.calculator;

import javafx.scene.control.Alert;

public class Calculator {

    private int total;

    public Calculator(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void reset() {
        total = 1;
    }

    public void multiplyBy(Integer operand) {

        total = total * operand;

    }

    public void showError(String errMessage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error Message");
        alert.setContentText(errMessage);
        alert.showAndWait();
    }
}
