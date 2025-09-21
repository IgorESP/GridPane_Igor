package com.igoresparza;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField nameField;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private Button okBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private void handleOk() {
        String text = nameField.getText();
        if (!text.isEmpty()) {
            descriptionArea.appendText(text + "\n");
            nameField.clear();
        }
    }

    @FXML
    private void handleCancel() {
        nameField.clear();
        descriptionArea.clear();
    }
}
