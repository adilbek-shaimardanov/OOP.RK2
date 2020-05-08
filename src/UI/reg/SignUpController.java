package UI.reg;

import Networking.Account;
import Networking.DataBaseHandler;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class SignUpController {


    @FXML
    private AnchorPane root;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private JFXButton sign;

    @FXML
    private JFXButton signup;

    @FXML
    private PasswordField passwordField2;

    @FXML
    private TextField emailField;

    @FXML
    private Text errorText;

    @FXML
    public void initialize() {
        errorText.setVisible(false);
    }

    @FXML
    void signin(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/sign/sign.fxml")));
    }

    @FXML
    void singup(ActionEvent event) throws IOException, ClassNotFoundException {
        String email = emailField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        String repeatPassword = passwordField2.getText();
        if(!email.equals("") && !username.equals("") && !password.equals("") && !repeatPassword.equals(""))
            if(password.equals(repeatPassword)){
                Account account = new Account(username, email, password);
                if(DataBaseHandler.newAccount(account)){
                    errorText.setVisible(false);
                    System.out.println("Succesful registration!");
                    root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/sign/sign.fxml")));
                }
                else{
                    errorText.setVisible(true);
                }
            }
    }

}
