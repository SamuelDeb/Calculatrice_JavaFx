package fr.km.calculatorfx;

import javafx.event.ActionEvent;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatriceController  {
    Calculatrice calculatrice;

    @FXML
    public void initialize(){
        calculatrice = new Calculatrice();
    }

    @FXML
    private TextField result;



    public void onClick (Event event){
        Button button = (Button) event.getSource();
        calculatrice.touche(button.getText());
        result.setText(calculatrice.toString());
    }



}