module com.tb1.tb1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.tb1.tb1 to javafx.fxml;
    exports com.tb1.tb1;
}