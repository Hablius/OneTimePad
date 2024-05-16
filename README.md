Autoren: Joel Häfeli, Emil Blank
Dokumentation unter: OneTimePad Dokumentation.pdf

## Benutzung der Anwendung

Die One-Time-Pad Verschlüsselungsanwendung bietet eine intuitive Benutzeroberfläche zum Verschlüsseln und Entschlüsseln von Nachrichten mit einem One-Time-Pad. Folgen Sie diesen Schritten, um die Anwendung effektiv zu nutzen:

### Starten der Anwendung

- Führen Sie die Hauptklasse `CipherMain` aus Ihrer IDE oder von der Kommandozeile aus. Dies wird das Hauptfenster der Anwendung öffnen.

### Hauptfunktionen der Anwendung

1. **Pad-Datei Laden**:
   - Klicken Sie auf den Button „Pad File einfügen“.
   - Wählen Sie über den erscheinenden Datei-Dialog eine Textdatei (.txt) aus, die Ihr One-Time-Pad enthält. 
   - Die Anwendung wird die ausgewählte Datei laden und für die Verschlüsselung und Entschlüsselung verwenden.

2. **Verschlüsseln einer Nachricht**:
   - Geben Sie den Text, den Sie verschlüsseln möchten, in das obere Textfeld ein.
   - Stellen Sie sicher, dass eine gültige Pad-Datei geladen ist.
   - Klicken Sie auf den Button „Verschlüsseln“. Der verschlüsselte Text wird im unteren Textfeld angezeigt.

3. **Entschlüsseln einer Nachricht**:
   - Geben Sie den verschlüsselten Text, den Sie entschlüsseln möchten, in das obere Textfeld ein.
   - Stellen Sie sicher, dass die gleiche Pad-Datei geladen ist, die zur Verschlüsselung des Textes verwendet wurde.
   - Klicken Sie auf den Button „Entschlüsseln“. Der entschlüsselte Text erscheint im unteren Textfeld.

### Statusanzeige

- Unter den Bedienungselementen befindet sich eine Statuszeile, die wichtige Informationen zur aktuellen Operation anzeigt, wie z.B. Erfolgsmeldungen beim Laden der Pad-Datei oder Fehlermeldungen, falls Probleme auftreten.

### Fehlerbehebung

Sollten Probleme bei der Nutzung der Anwendung auftreten:
- Überprüfen Sie, ob die Pad-Datei im korrekten Format vorliegt und keine ungültigen oder leeren Zeilen enthält.
- Stellen Sie sicher, dass für das Verschlüsseln und Entschlüsseln dieselbe Pad-Datei verwendet wird.
- Prüfen Sie die Konsolen- oder Statusmeldungen für Fehlerhinweise.

### Tipps zur optimalen Nutzung

- Nutzen Sie für jede Nachricht ein neues Pad, um die Sicherheit zu maximieren.
- Vermeiden Sie die Wiederverwendung von Pads, da dies die Sicherheit der Verschlüsselung erheblich mindert.

### Gruppenmitglieder
- Emil Blank
- Joël Häfeli
