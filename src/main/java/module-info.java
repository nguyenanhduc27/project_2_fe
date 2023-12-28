module com.mycompany.p2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.p2 to javafx.fxml;
    exports com.mycompany.p2;
}
