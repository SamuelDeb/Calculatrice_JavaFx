package fr.km.calculatorfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatriceApplication extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatriceApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Calculatrice");
        stage.setScene(scene);
        stage.setMinHeight(500);
        stage.setMinWidth(300);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}