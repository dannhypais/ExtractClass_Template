/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pa.refatoring.extractclass.calculator;

import com.pa.refatoring.extractclass.calculator.CalculatorUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author patricia.macedo
 */
public class MainAppCalculator extends Application {
    private Scene scene;
    private CalculatorUI calculatorUi;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        calculatorUi = new CalculatorUI();
        GridPane root = calculatorUi.initComponents();
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
