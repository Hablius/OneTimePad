package petShop;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class petShopView {
    protected petShopModel model;
    protected Stage stage;

    public petShopView(petShopModel model, Stage stage){
        this.model = model;
        this.stage = stage;


        VBox layout = new VBox();
        layout.getChildren().add(dataEntryPane());
        layout.getChildren().add(controlAreaPane());
        layout.getChildren().add(dataDisplayPane());

        Scene scene = new Scene(layout);
        scene.getStylesheets().add(getClass()
                .getResource("petShop.css").toExternalForm());
        stage.setTitle("Pet Shop");
        stage.setScene(scene);
        stage.show();
    }

    private Pane dataEntryPane(){
        GridPane dataEntry = new GridPane();
        dataEntry.setId("dataEntry");
        dataEntry.add(new Label("Data entry area"), 0, 0);
        return dataEntry;
    }

    private Pane controlAreaPane(){
        GridPane controlArea = new GridPane();
        controlArea.setId("dataControl");
        controlArea.add(new Label("Control area"), 0, 0);
        return controlArea;
    }

    private Pane dataDisplayPane(){
        GridPane dataDisplay = new GridPane();
        dataDisplay.setId("dataDisplay");
        dataDisplay.add(new Label("Data display area"), 0, 0);
        return dataDisplay;
    }

    public void start(){
        stage.show();
    }



}
