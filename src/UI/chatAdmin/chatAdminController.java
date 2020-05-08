package UI.chatAdmin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class chatAdminController {

    @FXML
    private AnchorPane root;

    @FXML
    private Button Book;

    @FXML
    private Button Buy;

    @FXML
    private Button Map;

    @FXML
    private Button Chat;

    @FXML
    void goToBook(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/book/book.fxml")));
    }

    @FXML
    void goToBuy(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/buy/buy.fxml")));
    }

    @FXML
    void goToChat(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/chat/chat.fxml")));
    }

    @FXML
    void goToMap(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/map/map.fxml")));
    }

}
