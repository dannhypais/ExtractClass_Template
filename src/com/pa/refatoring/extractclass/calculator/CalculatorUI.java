package com.pa.refatoring.extractclass.calculator;

import com.pa.refatoring.extractclass.calculator.Calculator;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculatorUI {
    private Slider slider;
    private TextField totalTf;
    private Button multiplyBtn;
    private Button clearBtn;
    private GridPane content;
    private Calculator calculator;

    public GridPane initComponents() {
        //... Initialize components
        calculator = new Calculator(1);
        initSlider();
        initBtns();
        initTextField();
        layoutComponents();
        return content;
    }

    private void initSlider() {
        slider = new Slider(0, 100, 1);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMinorTickCount(20);
        slider.setMajorTickUnit(20);
    }

    private void initBtns() {
        multiplyBtn = new Button("Multiply");
        clearBtn = new Button("Reset");
        setTriggers();
    }

    private void initTextField(){
        totalTf = new TextField();
        totalTf.setText(calculator.getTotal()+"");
        totalTf.setEditable(false);
    }

    private void layoutComponents() {
        content = new GridPane();
        content.setPadding(new Insets(15, 15, 15, 15));
        content.setVgap(10);
        content.setHgap(10);
        content.add(new Label("INPUT"), 0, 0);
        content.add(slider, 1, 0);
        content.add(multiplyBtn, 2, 0);
        content.add(new Label("TOTAL"), 0, 1);
        content.add(totalTf, 1, 1);
        content.add(clearBtn, 2, 1);
    }
    private void setTriggers() {
        multiplyBtn.setOnAction(
                event -> {
                    calculator.multiplyBy(getUserInput());
                    update();
                });
        clearBtn.setOnAction(
                event -> {
                    calculator.reset();
                    update();
                });
    }

    public int getUserInput() {
        int value = (int) slider.getValue();
        return value;
    }

    public void update() {

        totalTf.setText(calculator.getTotal()+"");
    }

    public void resetInput() {
        slider.setValue(1.0);
    }
}
