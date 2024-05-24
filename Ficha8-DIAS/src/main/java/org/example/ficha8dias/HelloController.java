package org.example.ficha8dias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button exitBtn;

    @FXML
    private Button clearBtn;

    @FXML
    private Button convBtn;

    @FXML
    private TextField celsiusTxt;

    @FXML
    private TextField fahrenheitTxt;

    @FXML
    void exitMethod(ActionEvent event) {
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    void clearMethod(ActionEvent event){
        celsiusTxt.clear();
        fahrenheitTxt.clear();
    }

    @FXML
    void convertMethod(ActionEvent event){

    }



}