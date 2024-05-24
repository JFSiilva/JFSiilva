package org.example.ficha8dias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Optional;

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
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmar Saída");
        alert.setHeaderText(null);
        alert.setContentText("Tem a certeza que pretende sair da aplicação?");
        ButtonType confirmar = new ButtonType("Confirmar");
        ButtonType cancelar = new ButtonType("Cancelar");
        alert.getButtonTypes().setAll(confirmar, cancelar);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == confirmar){
            Stage stage = (Stage) exitBtn.getScene().getWindow();
            stage.close();
        }

    }

    @FXML
    void clearMethod(ActionEvent event){
        if (celsiusTxt.getText().isEmpty() && fahrenheitTxt.getText().isEmpty()){
            showAlert(Alert.AlertType.WARNING, "Limpeza de Campos", "Os campos estão vazios!");
        }
        else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmação de limpeza de campos");
            alert.setHeaderText(null);
            alert.setContentText("Tem a certeza que pretende limpar o conteúdo de ambos os campos?");
            ButtonType confirmar = new ButtonType("Confirmar");
            ButtonType cancelar = new ButtonType("Cancelar");
            alert.getButtonTypes().setAll(confirmar, cancelar);
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == confirmar) {
                celsiusTxt.clear();
                fahrenheitTxt.clear();
                showAlert(Alert.AlertType.INFORMATION, "Campos Limpos", "Ambos os campos foram corretamente limpos.");
            }
        }
    }

    @FXML
    void convertMethod(ActionEvent event){
        try {
            // Get the Celsius value from the text field
            String celsiusString = celsiusTxt.getText();
            double celsius = Double.parseDouble(celsiusString);

            // Convert Celsius to Fahrenheit
            double fahrenheit = celsius * 9 / 5 + 32;

            // Set the Fahrenheit value to the text field
            fahrenheitTxt.setText(String.format("%.2f", fahrenheit));
            showAlert(Alert.AlertType.INFORMATION, "Conversão bem sucedida", "A conversão foi corretamente realizada");
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Tipo de dados não suportado", "Insira um valor de temperatura válido");
        }
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}