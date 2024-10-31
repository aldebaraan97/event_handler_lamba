module com.example.event_handling_lambada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.event_handling_lambada to javafx.fxml;
    exports com.example.event_handling_lambada;
}