module com.enset.tp_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.enset.tp_javafx to javafx.fxml;
//  exports com.enset.tp_javafx;

    exports com.enset.tp_javafx.controller;
    opens com.enset.tp_javafx.controller to javafx.fxml;
    exports com.enset.tp_javafx.service;
    opens com.enset.tp_javafx.service to javafx.fxml;
}