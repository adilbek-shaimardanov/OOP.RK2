package UI.buy;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class buyController {

    @FXML
    private AnchorPane root;

    @FXML
    private Text TextFrom;

    @FXML
    private Text TextTo;

    @FXML
    private Text CompanyName3;

    @FXML
    private ImageView CompanyLogo3;

    @FXML
    private Text Date3;

    @FXML
    private JFXButton BuyButton3;

    @FXML
    private Text Time3;

    @FXML
    private Text FinalDate3;

    @FXML
    private Text FinalTime3;

    @FXML
    private Text FlyTime3;

    @FXML
    private Text Price3;

    @FXML
    private JFXComboBox<?> ClassPicker;

    @FXML
    private JFXComboBox<?> FromPicker;

    @FXML
    private JFXComboBox<?> ToPicker;

    @FXML
    private Text CompanyName2;

    @FXML
    private ImageView CompanyLogo2;

    @FXML
    private Text Date2;

    @FXML
    private JFXButton BuyButton2;

    @FXML
    private Text Time2;

    @FXML
    private Text FinalDate2;

    @FXML
    private Text FinalTime2;

    @FXML
    private Text FlyTime2;

    @FXML
    private Text Price2;

    @FXML
    private Text CompanyName1;

    @FXML
    private ImageView CompanyLogo1;

    @FXML
    private Text Date1;

    @FXML
    private JFXButton BuyButton1;

    @FXML
    private Text Time1;

    @FXML
    private Text FinalDate1;

    @FXML
    private Text FinalTime1;

    @FXML
    private Text FlyTime1;

    @FXML
    private Text Price1;

    @FXML
    private JFXButton SearchButton;

    @FXML
    private JFXButton BackButton;

    @FXML
    void BackAction(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/main/main.fxml")));
    }

}
