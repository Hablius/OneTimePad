package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Calculator extends Application{
    private Calculator_controller controller;
    private Calculator_model model;
    private Calculator_view view;
    @Override
    public void start(Stage primaryStage) throws Exception{
        model = new Calculator_model();
        view = new Calculator_view(primaryStage, model);
        controller = new Calculator_controller(model, view);
        view.start();
    }
    public static void main(String[] args){
        launch();
    }





}
