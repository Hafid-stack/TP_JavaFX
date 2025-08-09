package com.enset.tp_javafx.service;

import com.enset.tp_javafx.domain.Product;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ProductView extends VBox {
    TextField nameField = new TextField();
    TextField priceField = new TextField();
    Button addButton = new Button("Add Product");
    ListView<Product> productListView = new ListView<>();

    public ProductView() {
        setSpacing(10);
        setPadding(new Insets(10));

        HBox form = new HBox(10);
        nameField.setPromptText("Product Name");
        priceField.setPromptText("Price");

        form.getChildren().addAll(nameField, priceField, addButton);
        getChildren().addAll(form, productListView);
    }

    public TextField getNameField() {
        return nameField;
    }

    public void setNameField(TextField nameField) {
        this.nameField = nameField;
    }

    public TextField getPriceField() {
        return priceField;
    }

    public void setPriceField(TextField priceField) {
        this.priceField = priceField;
    }

    public Button getAddButton() {
        return addButton;
    }

    public void setAddButton(Button addButton) {
        this.addButton = addButton;
    }

    public ListView<Product> getProductListView() {
        return productListView;
    }

    public void setProductListView(ListView<Product> productListView) {
        this.productListView = productListView;
    }
}
