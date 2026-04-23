module com.example.its18101_rillera_fa12_ex2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop; // Required for JOptionPane

    opens com.example.its18101_rillera_fa12_ex2 to javafx.fxml;
    exports com.example.its18101_rillera_fa12_ex2;
}