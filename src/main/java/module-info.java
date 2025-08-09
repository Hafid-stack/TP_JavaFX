module com.enset.tp_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.enset.tp_javafx to javafx.fxml;
//  exports com.enset.tp_javafx;
//    exports com.enset.tp_javafx to javafx.fxml; i add this one no idea why
    exports com.enset.tp_javafx.controller;
    opens com.enset.tp_javafx.controller to javafx.fxml;
}