package com.enset.tp_javafx.controller;

import com.enset.tp_javafx.domain.Product;
import com.enset.tp_javafx.service.ProductView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductController {
    private final ProductView view;
    private final ObservableList<Product> products = FXCollections.observableArrayList();

    public ProductController(ProductView view) {
        this.view = view;
        this.view.getProductListView().setItems(products);
        this.view.getAddButton().setOnAction(e -> addProduct());
    }

    private void addProduct() {
        String name = view.getNameField().getText();
        String priceText = view.getPriceField().getText();

        if (name.isEmpty() || priceText.isEmpty()) {
            // you could show an alert here for validation
            return;
        }

        try {
            double price = Double.parseDouble(priceText);
            Product product = new Product(name, price);
            products.add(product);

            // Clear fields
            view.getPriceField().clear();
            view.getNameField().clear();
        } catch (NumberFormatException ex) {
            // alert for invalid price input
        }
    }
}
