package petShop;

import javafx.application.Application;
import javafx.stage.Stage;
public class petShop extends Application {
    private petShopController controller;
    private petShopModel model;
    private petShopView view;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        model = new petShopModel();
        view = new petShopView(stage, model);
        controller = new petShopController(view, model);
        view.start();
    }
}
