package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
    @FXML
    public javafx.scene.control.TextField TextField;


    @FXML
    public void clickBtn1(ActionEvent actionEvent) {
        System.out.println("Кнопка 1");
    }
    @FXML
    public void clickBtn2(ActionEvent actionEvent) {
        TextArea.appendText(TextField.getText() + "\n");
        TextField.clear();
        TextField.requestFocus();
    }
    public javafx.scene.control.TextArea TextArea;

}
