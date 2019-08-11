package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Button Main_exit_btn;
    @FXML
    private Text Main_X_TEXT;

    public void Main_exit_btn_click(ActionEvent e){
        Stage stage = (Stage)Main_exit_btn.getScene().getWindow();
        stage.close();
    }

    public void Main_exit_btn_entered(MouseEvent e) {
        Main_X_TEXT.setFill(Color.web("Firebrick"));
    }

    public void Main_exit_btn_exited(MouseEvent e) {
        Main_X_TEXT.setFill(Color.web("#a9a9a9"));
    }
}
