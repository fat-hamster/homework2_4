package sample;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField;

    public void onSendButton() {
       if(!textField.getText().isBlank()) {
           textArea.appendText(textField.getText().replaceFirst("\\s+","") + '\n');
           textField.clear();
       }
    }
}
