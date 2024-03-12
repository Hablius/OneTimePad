package petShop;

import javafx.stage.Stage;

public class petShopView {
    protected petShopModel model;
    protected Stage stage;

    public petShopView(petShopModel model, Stage stage){
        this.model = model;
        this.stage = stage;
    }
    public void start(){
        stage.show();
    }
}
