package sam1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public Button btnRigth;
    @FXML
    public Slider slider;
    @FXML
    public Label label;

    @FXML
    public void clickExit(ActionEvent actionEvent) {
        Platform.runLater(() -> {
            Stage stage = (Stage) btnRigth.getScene().getWindow();
            stage.close();
        });
    }

    public void sliderOnMouseRealeased(MouseEvent mouseEvent) {
        label.setText(String.format("value = %.2f", slider.getValue()));
    }
}
