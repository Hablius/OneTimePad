package petShop;

import javafx.application.Application;
import javafx.stage.Stage;

public class petShop extends Application {
    private petShopView view;
    private petShopModel model;
    private petShopController controller;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            model = new petShopModel();
            view = new petShopView(stage, model);
            controller = new petShopController(model, view);

            view.start(); // Show the primary stage

            stage.setTitle("Pet Shop");
            stage.setMinWidth(500);
            stage.setMinHeight(400);
        } catch (Exception e) {
            e.printStackTrace(); // Print stack trace for any initialization errors
            System.exit(1); // Exit application on severe failure
            //catch created with GitHub copilot!
        }
    }
}

