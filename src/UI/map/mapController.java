package UI.map;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class mapController {

    @FXML
    private AnchorPane root;

    @FXML
    private JFXButton BackButton;

    @FXML
    private JFXComboBox FromPicker;

    @FXML
    private JFXComboBox ToPicker;

    @FXML
    private JFXButton showInfo;

    @FXML
    private JFXButton ata;

    @FXML
    private JFXButton sem;

    @FXML
    private JFXButton kok;

    @FXML
    private JFXButton shy;

    @FXML
    private JFXButton ast;

    @FXML
    private JFXButton ataNURshy2;

    @FXML
    private JFXButton ataNURshy3;

    @FXML
    private JFXButton ataNUR4;

    @FXML
    private JFXButton ataNUR5;

    @FXML
    private JFXButton ataNUR6;

    @FXML
    private JFXButton ataNUR7;

    @FXML
    private JFXButton ataNUR8;

    @FXML
    private JFXButton ataNUR9;

    @FXML
    private JFXButton ataNUR10;

    @FXML
    private JFXButton ataSEM2;

    @FXML
    private JFXButton ataSEM3;

    @FXML
    private JFXButton ataSEM4;

    @FXML
    private JFXButton ataSEM5;

    @FXML
    private JFXButton ataSEM6;

    @FXML
    private JFXButton ataSEM7;

    @FXML
    private JFXButton ataSEM8;

    @FXML
    private JFXButton ataSEM9;

    @FXML
    private JFXButton ataSEM10;

    @FXML
    private JFXButton ataSEM11;

    @FXML
    private JFXButton ataSEM12;

    @FXML
    private JFXButton ataSHY4;

    @FXML
    private JFXButton ataSHY5;

    @FXML
    private JFXButton ataSHY6;


    @FXML
    public void initialize() {
        ata.setVisible(false);
        sem.setVisible(false);
        kok.setVisible(false);
        shy.setVisible(false);
        ast.setVisible(false);
        ataNURshy2.setVisible(false);
        ataNURshy3.setVisible(false);
        ataNUR4.setVisible(false);
        ataNUR5.setVisible(false);
        ataNUR6.setVisible(false);
        ataNUR7.setVisible(false);
        ataNUR8.setVisible(false);
        ataNUR9.setVisible(false);
        ataNUR10.setVisible(false);
        ataSEM2.setVisible(false);
        ataSEM3.setVisible(false);
        ataSEM4.setVisible(false);
        ataSEM5.setVisible(false);
        ataSEM6.setVisible(false);
        ataSEM7.setVisible(false);
        ataSEM8.setVisible(false);
        ataSEM9.setVisible(false);
        ataSEM10.setVisible(false);
        ataSEM11.setVisible(false);
        ataSEM12.setVisible(false);
        ataSHY4.setVisible(false);
        ataSHY5.setVisible(false);
        ataSHY6.setVisible(false);
    }

    @FXML
    void ShowInfo(ActionEvent event) {
        if(FromPicker.getValue().equals("Almaty")&&(ToPicker.getValue().equals("Nur-Sultan"))){
            ataNUR5.setVisible((true));
        }
    }

    @FXML
    void BackAction(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/main/main.fxml")));
    }

    @FXML
    void fromClicked(MouseEvent event) {
        if (FromPicker.getItems().isEmpty()){
            FromPicker.getItems().addAll(
                    "Almaty",
                    "Kokshetau",
                    "Nur-Sultan",
                    "Semey",
                    "Shymkent");
        }
    }

    @FXML
    void toClicked(MouseEvent event) {
        if(ToPicker.getItems().isEmpty()) {
            ToPicker.getItems().addAll(
                    "Almaty",
                    "Kokshetau",
                    "Nur-Sultan",
                    "Semey",
                    "Shymkent");
        }
    }

}
