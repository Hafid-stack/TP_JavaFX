package com.enset.tp_javafx.controller;

import com.enset.tp_javafx.controller.ProductController;
import com.enset.tp_javafx.service.ProductView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProductApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        ProductView view = new ProductView();
        ProductController controller = new ProductController(view);

        Scene scene = new Scene(view, 400, 300);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        primaryStage.setTitle("Product Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
