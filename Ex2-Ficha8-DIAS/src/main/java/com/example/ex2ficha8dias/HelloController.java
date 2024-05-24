package com.example.ex2ficha8dias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    private int contador;

    @FXML
    private Button clickBtn;

    @FXML
    private Label clickCountLabel;

    @FXML
    void clickMethod(ActionEvent event) {
        contador++;
        clickCountLabel.setText(String.valueOf(contador));
    }
}