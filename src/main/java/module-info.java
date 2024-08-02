module com.calculate {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.calculate to javafx.fxml;
    exports com.calculate;
}
