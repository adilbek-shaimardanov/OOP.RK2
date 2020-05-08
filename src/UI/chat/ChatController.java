package UI.chat;

import Networking.Client;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ChatController {

    @FXML
    private String string="";

    @FXML
    private AnchorPane root;

    @FXML
    private TextField inputText;

    @FXML
    private TextArea outputText;

    @FXML
    private Button sendButton;

    @FXML
    public void sendAction(ActionEvent event) throws IOException {
        Client client = new Client();
        client.sendMessage(inputText.getText());
        string = string + "\n" + inputText.getText();
        outputText.setText(string);
        inputText.setText("");

    }

}
