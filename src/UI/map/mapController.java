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
import java.time.LocalDate;
import java.time.LocalTime;

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
    private JFXComboBox TypePicker;

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
    private JFXButton kokNURsem2;

    @FXML
    private JFXButton kokNURsem3;

    @FXML
    private JFXButton kokSEM4;

    @FXML
    private JFXButton kokSEM5;

    @FXML
    private JFXButton kokSEM6;

    @FXML
    private JFXButton kokSEM7;

    @FXML
    private JFXButton kokSEM8;

    @FXML
    private JFXButton kokSEM9;

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
        kokNURsem2.setVisible(false);
        kokNURsem3.setVisible(false);
        kokSEM4.setVisible(false);
        kokSEM5.setVisible(false);
        kokSEM6.setVisible(false);
        kokSEM7.setVisible(false);
        kokSEM8.setVisible(false);
        kokSEM9.setVisible(false);
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

    @FXML
    void typeClicked(MouseEvent event) {
        if(TypePicker.getItems().isEmpty()) {
            TypePicker.getItems().addAll(
                    "Platzkart",
                    "Coupe",
                    "'Talgo'");
        }
    }

    @FXML
    void ShowInfo(ActionEvent event) {
        int travelTime;
        LocalTime nowTime = LocalTime.now();
        if(FromPicker.getValue().equals("Almaty")&&(ToPicker.getValue().equals("Nur-Sultan"))&&(TypePicker.getValue().equals("Platzkart"))){
            if((nowTime.getHour()*60+nowTime.getMinute()>=7*60+3) && (nowTime.getHour()*60+nowTime.getMinute())<=17*60+27){
                travelTime = (nowTime.getHour()*60+nowTime.getMinute()-7*60+3)/60;
                if((nowTime.getHour()*60+nowTime.getMinute()-7*60+3)%60 > 30){travelTime++;}
                if(travelTime==0){initialize(); ata.setVisible(true); ast.setVisible(true);}
                if(travelTime==1){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy2.setVisible(true);}
                if(travelTime==2){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy3.setVisible(true);}
                if(travelTime==3){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR4.setVisible(true);}
                if(travelTime==4){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR5.setVisible(true);}
                if(travelTime==5){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR6.setVisible(true);}
                if(travelTime==6){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR7.setVisible(true);}
                if(travelTime==7){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR8.setVisible(true);}
                if(travelTime==8){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR9.setVisible(true);}
                if(travelTime==9){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR10.setVisible(true);}
                if(travelTime==10){initialize(); ata.setVisible(true); ast.setVisible(true);}
                travelTime=0;
            }
        }
        if(FromPicker.getValue().equals("Almaty")&&(ToPicker.getValue().equals("Nur-Sultan"))&&(TypePicker.getValue().equals("Coupe"))){
            if((nowTime.getHour()*60+nowTime.getMinute()>=9*60+18) && (nowTime.getHour()*60+nowTime.getMinute())<=19*60+20){
                travelTime = (nowTime.getHour()*60+nowTime.getMinute()-9*60+18)/60;
                if((nowTime.getHour()*60+nowTime.getMinute()-9*60+18)%60 > 30){travelTime++;}
                if(travelTime==0){initialize(); ata.setVisible(true); ast.setVisible(true);}
                if(travelTime==1){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy2.setVisible(true);}
                if(travelTime==2){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy3.setVisible(true);}
                if(travelTime==3){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR4.setVisible(true);}
                if(travelTime==4){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR5.setVisible(true);}
                if(travelTime==5){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR6.setVisible(true);}
                if(travelTime==6){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR7.setVisible(true);}
                if(travelTime==7){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR8.setVisible(true);}
                if(travelTime==8){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR9.setVisible(true);}
                if(travelTime==9){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR10.setVisible(true);}
                if(travelTime==10){initialize(); ata.setVisible(true); ast.setVisible(true);}
                travelTime=0;

            }
        }
        if(FromPicker.getValue().equals("Almaty")&&(ToPicker.getValue().equals("Nur-Sultan"))&&(TypePicker.getValue().equals("'Talgo'"))){
            if((nowTime.getHour()*60+nowTime.getMinute()>=10*60+33) && (nowTime.getHour()*60+nowTime.getMinute())<=18*60+15){
                travelTime = (nowTime.getHour()*60+nowTime.getMinute()-10*60+33)/60;
                if((nowTime.getHour()*60+nowTime.getMinute()-10*60+33)%60 > 30){travelTime++;}
                if(travelTime==0){initialize(); ata.setVisible(true); ast.setVisible(true);}
                if(travelTime==1){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy2.setVisible(true);}
                if(travelTime==2){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR4.setVisible(true);}
                if(travelTime==3){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR5.setVisible(true);}
                if(travelTime==4){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR6.setVisible(true);}
                if(travelTime==5){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR7.setVisible(true);}
                if(travelTime==6){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR9.setVisible(true);}
                if(travelTime==7){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR10.setVisible(true);}
                if(travelTime==8){initialize(); ata.setVisible(true); ast.setVisible(true);}
                travelTime=0;

            }
        }

        if(FromPicker.getValue().equals("Nur-sultan")&&(ToPicker.getValue().equals("Almaty"))&&(TypePicker.getValue().equals("Platzkart"))){
            int x = 17, y = 57, w = 4, z = 21;
            if((nowTime.getHour()*60+nowTime.getMinute()>=x*60+y) && (nowTime.getHour()*60+nowTime.getMinute())<=w*60+z){
                travelTime = (nowTime.getHour()*60+nowTime.getMinute()-x*60+y)/60;
                if((nowTime.getHour()*60+nowTime.getMinute()-x*60+y)%60 > 30){travelTime++;}
                if(travelTime==10){initialize(); ata.setVisible(true); ast.setVisible(true);}
                if(travelTime==9){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy2.setVisible(true);}
                if(travelTime==8){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy3.setVisible(true);}
                if(travelTime==7){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR4.setVisible(true);}
                if(travelTime==6){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR5.setVisible(true);}
                if(travelTime==5){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR6.setVisible(true);}
                if(travelTime==4){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR7.setVisible(true);}
                if(travelTime==3){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR8.setVisible(true);}
                if(travelTime==2){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR9.setVisible(true);}
                if(travelTime==1){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR10.setVisible(true);}
                if(travelTime==0){initialize(); ata.setVisible(true); ast.setVisible(true);}
                travelTime=0;

            }
        }
        if(FromPicker.getValue().equals("Nur-sultan")&&(ToPicker.getValue().equals("Almaty"))&&(TypePicker.getValue().equals("Coupe"))){
            int x = 19, y = 50, w = 5, z = 52;
            if((nowTime.getHour()*60+nowTime.getMinute()>=x*60+y) && (nowTime.getHour()*60+nowTime.getMinute())<=w*60+z){
                travelTime = (nowTime.getHour()*60+nowTime.getMinute()-x*60+y)/60;
                if((nowTime.getHour()*60+nowTime.getMinute()-x*60+y)%60 > 30){travelTime++;}
                if(travelTime==10){initialize(); ata.setVisible(true); ast.setVisible(true);}
                if(travelTime==9){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy2.setVisible(true);}
                if(travelTime==8){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy3.setVisible(true);}
                if(travelTime==7){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR4.setVisible(true);}
                if(travelTime==6){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR5.setVisible(true);}
                if(travelTime==5){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR6.setVisible(true);}
                if(travelTime==4){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR7.setVisible(true);}
                if(travelTime==3){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR8.setVisible(true);}
                if(travelTime==2){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR9.setVisible(true);}
                if(travelTime==1){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR10.setVisible(true);}
                if(travelTime==0){initialize(); ata.setVisible(true); ast.setVisible(true);}
                travelTime=0;

            }
        }
        if(FromPicker.getValue().equals("Nur-sultan")&&(ToPicker.getValue().equals("Almaty"))&&(TypePicker.getValue().equals("Coupe"))){
            int x = 18, y = 45, w = 2, z = 27;
            if((nowTime.getHour()*60+nowTime.getMinute()>=x*60+y) && (nowTime.getHour()*60+nowTime.getMinute())<=w*60+z){
                travelTime = (nowTime.getHour()*60+nowTime.getMinute()-x*60+y)/60;
                if((nowTime.getHour()*60+nowTime.getMinute()-x*60+y)%60 > 30){travelTime++;}
                if(travelTime==8){initialize(); ata.setVisible(true); ast.setVisible(true);}
                if(travelTime==7){initialize(); ata.setVisible(true); ast.setVisible(true); ataNURshy2.setVisible(true);}
                if(travelTime==6){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR4.setVisible(true);}
                if(travelTime==5){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR5.setVisible(true);}
                if(travelTime==4){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR6.setVisible(true);}
                if(travelTime==3){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR7.setVisible(true);}
                if(travelTime==2){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR9.setVisible(true);}
                if(travelTime==1){initialize(); ata.setVisible(true); ast.setVisible(true); ataNUR10.setVisible(true);}
                if(travelTime==0){initialize(); ata.setVisible(true); ast.setVisible(true);}
                travelTime=0;

            }
        }
    }
}
