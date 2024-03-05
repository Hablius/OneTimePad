package calculator;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;


public class Calculator_view {
    protected Stage stage;
    protected Calculator_model model;
    protected VBox rightBox = new VBox();
    protected HBox bottomBox = new HBox();
    protected GridPane buttonPane = new GridPane();
    protected TextField display;
    protected Button[] numbers  = new Button[10];
    protected Button plus;
    protected Button minus;
    protected Button multiply;
    protected Button divide;
    protected Button equals;
    protected Button clear;
    public Calculator_view(Stage primaryStage, Calculator_model model) {
        this.stage = primaryStage;
        this.model = model;


        display = new TextField();
        display.setDisable(true);
        BorderPane root = new BorderPane();
        root.setBottom(bottomBox);
        root.setCenter(buttonPane);
        root.setRight(rightBox);
        root.setTop(display);

        // Create the buttons and add them to the buttonPane
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Button(Integer.toString(i));
            buttonPane.add(numbers[i], i % 3, 3 - i / 3);
        }

        // Add the operations buttons
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");
        Button equals = new Button("=");
        Button clear = new Button("C");

        buttonPane.add(plus, 3, 0);
        buttonPane.add(minus, 3, 1);
        buttonPane.add(multiply, 3, 2);
        buttonPane.add(divide, 3, 3);
        buttonPane.add(equals, 4, 0, 1, 2);
        buttonPane.add(clear, 4, 2, 1, 2);


        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(25);
        buttonPane.getColumnConstraints().addAll(cc, cc, cc, cc);
        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(25);
        buttonPane.getRowConstraints().addAll(rc, rc, rc, rc);


        Scene scene = new Scene(root);
        stage.setTitle("Calculator");
        scene.getStylesheets().add(getClass().getResource("Calculator.css").toExternalForm());
        stage.setScene(scene);

    }
    public void start() {
        stage.show();
    }
}


