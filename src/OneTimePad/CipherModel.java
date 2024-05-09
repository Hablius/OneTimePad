package OneTimePad;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CipherModel {
    private List<Integer> oneTimePad;
    private int currentPosition = 0;

    //Konstruktor
    public CipherModel(String padFilePath) throws Exception { //Dateipfad als Parameter
        oneTimePad = Files.lines(Paths.get(padFilePath)) //lädt Zeilen der Datei als Stream, konvertiert String in ein path Objekt
                .map(String::trim)                       //Zeile wird von Leerzeichen befreit (Anfang, Ende)
                .filter(line -> !line.isEmpty()) //sicherstellen, dass keine Leerzeichen vorhanden sind
                .flatMapToInt(String::chars)//transformiert Zeilen in einen IntStream
                .boxed() // int werte zu Integer umwandeln
                .collect(Collectors.toList());  //Integer werte werden in Liste gessammelt
    }

    // Nachricht verschlüsseln
    public String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (currentPosition >= oneTimePad.size()) {
                throw new IllegalStateException("One-Time Pad ist ausgeschöpft.");
            }
            int messageValue = character - 32; //ASCII Bereich 32-126 -> -32 = 0-94
            int padValue = oneTimePad.get(currentPosition++) - 32;
            char encryptedChar = (char) (((messageValue + padValue) % 95) + 32); //sicherstellen das Ergebnis im druckbaren Bereich bleibt
            encrypted.append(encryptedChar); //verschlüsselter char wird an Strinbuilder angehängt
        }
        return encrypted.toString();
    }

    // Nachricht entschlüsseln
    public String decrypt(String encryptedMessage) {
        StringBuilder decrypted = new StringBuilder();
        resetPad(); // Stellt sicher, dass currentPosition auf 0 gesetzt ist
        for (char character : encryptedMessage.toCharArray()) {
            if (currentPosition >= oneTimePad.size()) {
                throw new IllegalStateException("One-Time Pad ist ausgeschöpft.");
            }
            int encryptedValue = character - 32;
            int padValue = oneTimePad.get(currentPosition) - 32;
            char decryptedChar = (char) (((encryptedValue - padValue + 95) % 95) + 32);
            decrypted.append(decryptedChar);
            currentPosition++;
        }
        return decrypted.toString();
    }

    public void resetPad() {
        currentPosition = 0;
    }
}