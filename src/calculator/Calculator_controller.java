package calculator;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Calculator_controller implements EventHandler<ActionEvent> {
    final private Calculator_model model;
    final private Calculator_view view;
    public Calculator_controller(Calculator_model model, Calculator_view view) {
        this.model = model;
        this.view = view;

        // register for events
      for (Button b : view.numbers) {
            b.setOnAction(this);
        }
        view.plus.setOnAction(this);
        view.minus.setOnAction(this);
        view.divide.setOnAction(this);
        view.multiply.setOnAction(this);
        view.clear.setOnAction(this);
        view.equals.setOnAction(this);


    }

    @Override
    public void handle(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (btn == view.clear) {
            view.display.setText("");
        } else if (btn == view.equals) {
            String result = model.calculate(view.display.getText());
            view.display.setText(result);
        } else {
            view.display.setText(view.display.getText() + btn.getText());
        }
    }
}


