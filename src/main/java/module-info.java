module fr.km.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.km.calculatorfx to javafx.fxml;
    exports fr.km.calculatorfx;
}