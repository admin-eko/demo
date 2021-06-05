package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField;

    @FXML
    public void clickBtn1(ActionEvent actionEvent) {
        System.out.println("java");
    }

    public void clickBtnSend(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
