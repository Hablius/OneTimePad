package petShop;

public class petShopController {
    final private petShopModel model;
    final private petShopView view;

    public petShopController(petShopModel model, petShopView view){
        this.model = model;
        this.view = view;
    }
}
