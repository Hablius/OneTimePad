package petShop;

import javafx.event.ActionEvent;
import petShop.Pet.Species;
import petShop.Pet.Gender;
import javafx.scene.control.Button;

public class petShopController {
    private petShopView view;
    private petShopModel model;

    public petShopController(petShopModel model, petShopView view) {
        this.model = model;
        this.view = view;

        // Initialize the event handlers
        view.btnSave.setOnAction(this::save);
        view.btnDelete.setOnAction(this::delete);
        view.btnNext.setOnAction(this::nextPet);
        view.btnPrevious.setOnAction(this::previousPet);
    }

    private void nextPet(ActionEvent e) {
        Pet pet = model.nextPet();
        if (pet != null) {
            updateView(pet);
        }
    }

    private void previousPet(ActionEvent e) {
        Pet pet = model.previousPet();
        if (pet != null) {
            updateView(pet);
        }
    }

    private void save(ActionEvent e) {
        Species species = view.cmbSpecies.getValue();
        Gender gender = view.cmbGender.getValue();
        String name = view.txtName.getText();

        // Basic input validation
        if (species != null && gender != null && name != null && !name.trim().isEmpty()) {
            model.savePet(species, gender, name.trim());
            updateView(model.getPet());
        } else {
            // Possibly show an error message to the user
            System.out.println("Please ensure all fields are correctly filled.");
        }
    }

    private void delete(ActionEvent e) {
        model.deletePet();
        updateView(model.getPet()); // Refresh view to show no data
    }

    private void updateView(Pet pet) {
        if (pet != null) {
            view.lblDataID.setText(Integer.toString(pet.getID()));
            view.lblDataName.setText(pet.getName());
            view.lblDataSpecies.setText(pet.getSpecies().toString());
            view.lblDataGender.setText(pet.getGender().toString());
        } else {
            // Clear all labels if there is no pet
            view.lblDataID.setText("");
            view.lblDataName.setText("");
            view.lblDataSpecies.setText("");
            view.lblDataGender.setText("");
        }
    }
}
