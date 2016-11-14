package com.shittygamer.mrtheplague;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML private TextArea chatBox;
    @FXML private TextField inputBox;

    @FXML protected void handleSend(ActionEvent event) {
        chatBox.appendText("You: " + inputBox.getText() + "\n");
        checkInput(inputBox.getText());
        inputBox.setText("");
    }

    private void checkInput(String input) {
        if(input.toLowerCase().contains("help")) {
            // do stuff
            chatBox.appendText("Mr. The Plague: helping\n");
        }
    }
}
