package UI.chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ChatController {

    @FXML
    private String string="";

    @FXML
    private AnchorPane root;

    @FXML
    private TextArea inputText;

    @FXML
    private TextArea outputText;

    @FXML
    private Button sendButton;

    @FXML
    public void sendAction(ActionEvent event) throws IOException {
        if(!inputText.getText().isEmpty()) {
        outputText.insertText(0, "\nMe: " + inputText.getText());}
        inputText.setText("");

    }

    @FXML
    void BackAction(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/main/main.fxml")));
    }

    @FXML
    public void offText(KeyEvent event){
        outputText.setEditable(false);
    };

}
