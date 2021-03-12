package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Window;

public class Controller {

    @FXML
    private Button Login;

    @FXML
    public void Login(ActionEvent event){
        Window owner = Login.getScene().getWindow();

        showAlert(owner);
    }

    private static void showAlert(Window owner) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initOwner(owner);
        alert.show();
    }

}
