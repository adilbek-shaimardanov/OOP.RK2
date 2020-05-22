package UI.sign;

import Networking.Client;
import Networking.DataBaseHandler;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.prefs.Preferences;

public class SignInController {

    @FXML
    private AnchorPane root;

    @FXML
    private PasswordField pass;

    @FXML
    private TextField login;

    @FXML
    private JFXButton signin;

    @FXML
    private JFXButton signup;


    @FXML
    private Text errorText;

    @FXML
    public void initialize() {
        errorText.setVisible(false);
    }

    @FXML
    void sign(ActionEvent event) throws IOException, ClassNotFoundException {
        String email = login.getText();
        String password = pass.getText();
        if (!email.equals("") || !password.equals("")) {
            if(DataBaseHandler.loginAccount(email, password) != null) {
                Client client = new Client();
                errorText.setVisible(false);
                Preferences pref = Preferences.userRoot().node("/src");
                pref.put("login", email);
                root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/main/main.fxml")));
            }
            else {
                errorText.setVisible(true);
            }
        }
        }



    @FXML
    void signup(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/reg/reg.fxml")));
    }

}
