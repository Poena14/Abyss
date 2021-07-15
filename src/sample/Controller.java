package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.util.ResourceBundle;

public class Controller {

    @FXML
    private Label lbvalor1;

    public void accionBoton(ActionEvent event){
        lbvalor1.setText("Cambio por el botn");

    }

    public void initialize(ResourceBundle rb){
    }

}
