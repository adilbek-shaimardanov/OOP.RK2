package UI.chat;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ChatController {

    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField inputText;

    @FXML
    private JFXTextArea outputText;

    @FXML
    private JFXButton sendButton;

    @FXML
    public void sendAction(ActionEvent event) {

    }

}
