package OneTimePad;

import javafx.stage.FileChooser;

public class CipherController {
    private CipherView view;
    private CipherModel model;

    // Konstruktor: Initialisiert den Controller mit einer Ansicht (view)
    public CipherController(CipherView view) {
        this.view = view;
        setupHandlers();
    }

    // Einrichten von Ereignishandlern für die Benutzeroberfläche
    private void setupHandlers() {
        view.getEncryptButton().setOnAction(event -> encryptMessage()); // Handler für Verschlüsselungsaktion
        view.getDecryptButton().setOnAction(event -> decryptMessage()); // Handler für Entschlüsselungsaktion
        view.getFileButton().setOnAction(event -> loadPadFile()); // Handler für das Laden der Pad-Datei
    }

    // Methode zum Verschlüsseln einer Nachricht
    private void encryptMessage() {
        try {
            String encrypted = model.encrypt(view.getInputText());
            view.setOutputText(encrypted); // Anzeige des verschlüsselten Textes
        } catch (Exception e) {
            view.setStatus("Error: " + e.getMessage()); // Anzeige von Fehlermeldungen
        }
    }

    // Methode zum Entschlüsseln einer Nachricht
    private void decryptMessage() {
        try {
            String decrypted = model.decrypt(view.getInputText());
            view.setOutputText(decrypted); // Anzeige des entschlüsselten Textes
        } catch (Exception e) {
            view.setStatus("Error: " + e.getMessage()); // Anzeige von Fehlermeldungen
        }
    }

    // Methode zum Laden einer Pad-Datei
    private void loadPadFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open One-Time Pad File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        var file = fileChooser.showOpenDialog(view.getStage());
        if (file != null) {
            try {
                model = new CipherModel(file.getAbsolutePath());
                view.setStatus("Pad loaded successfully.");
            } catch (Exception e) {
                view.setStatus("Failed to load pad: " + e.getMessage());
            }
        }
    }
}
