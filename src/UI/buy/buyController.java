package UI.buy;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.io.IOException;
import java.time.LocalDate;

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
    private JFXComboBox ClassPicker;

    @FXML
    private JFXComboBox FromPicker;

    @FXML
    private JFXComboBox ToPicker;

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
    private ToolBar bar1;

    @FXML
    private ToolBar bar2;

    @FXML
    private ToolBar bar3;

    @FXML
    private Line line1;

    @FXML
    private Line line2;

    @FXML
    private Line line3;

    @FXML
    private DatePicker DatePicker;

    @FXML
    private Text sorry;

    @FXML
    private Text errDirect;

    @FXML
    public void initialize() {
        CompanyName1.setVisible(false);
        Date1.setVisible(false);
        Time1.setVisible(false);
        FinalDate1.setVisible(false);
        FinalTime1.setVisible(false);
        FlyTime1.setVisible(false);
        Price1.setVisible(false);
        BuyButton1.setVisible(false);
        line1.setVisible(false);
        bar1.setVisible(false);

        CompanyName2.setVisible(false);
        Date2.setVisible(false);
        Time2.setVisible(false);
        FinalDate2.setVisible(false);
        FinalTime2.setVisible(false);
        FlyTime2.setVisible(false);
        Price2.setVisible(false);
        BuyButton2.setVisible(false);
        line2.setVisible(false);
        bar2.setVisible(false);

        CompanyName3.setVisible(false);
        Date3.setVisible(false);
        Time3.setVisible(false);
        FinalDate3.setVisible(false);
        FinalTime3.setVisible(false);
        FlyTime3.setVisible(false);
        Price3.setVisible(false);
        BuyButton3.setVisible(false);
        line3.setVisible(false);
        bar3.setVisible(false);

        DatePicker.setValue(LocalDate.now());
        sorry.setVisible(false);
        errDirect.setVisible(false);
    }

    @FXML
    public void show3() {
        bar1.setVisible(true);
        CompanyName1.setVisible(true);
        Date1.setVisible(true);
        Time1.setVisible(true);
        FinalDate1.setVisible(true);
        FinalTime1.setVisible(true);
        FlyTime1.setVisible(true);
        Price1.setVisible(true);
        BuyButton1.setVisible(true);
        line1.setVisible(true);

        bar2.setVisible(true);
        CompanyName2.setVisible(true);
        Date2.setVisible(true);
        Time2.setVisible(true);
        FinalDate2.setVisible(true);
        FinalTime2.setVisible(true);
        FlyTime2.setVisible(true);
        Price2.setVisible(true);
        BuyButton2.setVisible(true);
        line2.setVisible(true);

        bar3.setVisible(true);
        CompanyName3.setVisible(true);
        Date3.setVisible(true);
        Time3.setVisible(true);
        FinalDate3.setVisible(true);
        FinalTime3.setVisible(true);
        FlyTime3.setVisible(true);
        Price3.setVisible(true);
        BuyButton3.setVisible(true);
        line3.setVisible(true);
    }

    @FXML
    public void show2() {
        bar1.setVisible(true);
        CompanyName1.setVisible(true);
        Date1.setVisible(true);
        Time1.setVisible(true);
        FinalDate1.setVisible(true);
        FinalTime1.setVisible(true);
        FlyTime1.setVisible(true);
        Price1.setVisible(true);
        BuyButton1.setVisible(true);
        line1.setVisible(true);

        bar2.setVisible(true);
        CompanyName2.setVisible(true);
        Date2.setVisible(true);
        Time2.setVisible(true);
        FinalDate2.setVisible(true);
        FinalTime2.setVisible(true);
        FlyTime2.setVisible(true);
        Price2.setVisible(true);
        BuyButton2.setVisible(true);
        line2.setVisible(true);
    }

    @FXML
    public void show1() {
        bar1.setVisible(true);
        CompanyName1.setVisible(true);
        Date1.setVisible(true);
        Time1.setVisible(true);
        FinalDate1.setVisible(true);
        FinalTime1.setVisible(true);
        FlyTime1.setVisible(true);
        Price1.setVisible(true);
        BuyButton1.setVisible(true);
        line1.setVisible(true);
    }

    @FXML
    public void hide1(){
        CompanyName1.setVisible(false);
        Date1.setVisible(false);
        Time1.setVisible(false);
        FinalDate1.setVisible(false);
        FinalTime1.setVisible(false);
        FlyTime1.setVisible(false);
        Price1.setVisible(false);
        BuyButton1.setVisible(false);
        line1.setVisible(false);
        bar1.setVisible(false);

        CompanyName2.setVisible(false);
        Date2.setVisible(false);
        Time2.setVisible(false);
        FinalDate2.setVisible(false);
        FinalTime2.setVisible(false);
        FlyTime2.setVisible(false);
        Price2.setVisible(false);
        BuyButton2.setVisible(false);
        line2.setVisible(false);
        bar2.setVisible(false);

        CompanyName3.setVisible(false);
        Date3.setVisible(false);
        Time3.setVisible(false);
        FinalDate3.setVisible(false);
        FinalTime3.setVisible(false);
        FlyTime3.setVisible(false);
        Price3.setVisible(false);
        BuyButton3.setVisible(false);
        line3.setVisible(false);
        bar3.setVisible(false);
    }

    @FXML
    public void hide2(){
        CompanyName2.setVisible(false);
        Date2.setVisible(false);
        Time2.setVisible(false);
        FinalDate2.setVisible(false);
        FinalTime2.setVisible(false);
        FlyTime2.setVisible(false);
        Price2.setVisible(false);
        BuyButton2.setVisible(false);
        line2.setVisible(false);
        bar2.setVisible(false);

        CompanyName3.setVisible(false);
        Date3.setVisible(false);
        Time3.setVisible(false);
        FinalDate3.setVisible(false);
        FinalTime3.setVisible(false);
        FlyTime3.setVisible(false);
        Price3.setVisible(false);
        BuyButton3.setVisible(false);
        line3.setVisible(false);
        bar3.setVisible(false);
    }

    @FXML
    public void hide3(){CompanyName2.setVisible(false);
        CompanyName3.setVisible(false);
        Date3.setVisible(false);
        Time3.setVisible(false);
        FinalDate3.setVisible(false);
        FinalTime3.setVisible(false);
        FlyTime3.setVisible(false);
        Price3.setVisible(false);
        BuyButton3.setVisible(false);
        line3.setVisible(false);
        bar3.setVisible(false);};

    @FXML
    void BackAction(ActionEvent event) throws IOException {
        root.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("/UI/main/main.fxml")));
    }

    @FXML
    void fromClicked(MouseEvent event) {
        if (FromPicker.getItems().isEmpty()) {
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

        if (ToPicker.getItems().isEmpty()) {
            ToPicker.getItems().addAll(
                    "Almaty",
                    "Kokshetau",
                    "Nur-Sultan",
                    "Semey",
                    "Shymkent");
        }
    }

    public int getDay() {
        LocalDate fromDate = DatePicker.getValue();
        return fromDate.getDayOfMonth();
    }

    public int getMonth() {
        LocalDate fromDate = DatePicker.getValue();
        return fromDate.getMonthValue();
    }

    public int getYear() {
        LocalDate fromDate = DatePicker.getValue();
        return fromDate.getYear();
    }

    @FXML
    public void searchPress(ActionEvent event) {
        LocalDate fromDate = DatePicker.getValue();
        if ((FromPicker.getValue().equals("Almaty")) && (ToPicker.getValue().equals("Nur-Sultan"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            CompanyName3.setText("'Talgo'");
            FlyTime1.setText("~10 hours");
            FlyTime2.setText("~10 hours");
            FlyTime3.setText("~8 hours");
            Time1.setText("07:03");
            Time2.setText("09:18");
            Time3.setText("10:33");
            FinalTime1.setText("17:27");
            FinalTime2.setText("19:20");
            FinalTime3.setText("18:15");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date3.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(7, 3, 10, 24));
            FinalDate2.setText(FinalDate(9, 18, 10, 2));
            FinalDate3.setText(FinalDate(11, 33, 7, 42));
            show3();
        }
        if ((FromPicker.getValue().equals("Nur-Sultan")) && (ToPicker.getValue().equals("Almaty"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            CompanyName3.setText("'Talgo'");
            FlyTime1.setText("~10 hours");
            FlyTime2.setText("~10 hours");
            FlyTime3.setText("~8 hours");
            Time1.setText("17:57");
            Time2.setText("19:50");
            Time3.setText("18:45");
            FinalTime1.setText("04:21");
            FinalTime2.setText("05:52");
            FinalTime3.setText("02:27");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date3.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(17, 57, 10, 24));
            FinalDate2.setText(FinalDate(19, 50, 10, 2));
            FinalDate3.setText(FinalDate(18, 45, 7, 42));
            show3();
        }
        if ((FromPicker.getValue().equals("Kokshetau")) && (ToPicker.getValue().equals("Nur-Sultan"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            hide3();
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            FlyTime1.setText("~3 hours");
            FlyTime2.setText("~3 hours");
            Time1.setText("12:43");
            Time2.setText("10:20");
            FinalTime1.setText("15:45");
            FinalTime2.setText("13:08");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(12, 43, 3, 2));
            FinalDate2.setText(FinalDate(10, 20, 2, 48));
            show2();
        }
        if ((FromPicker.getValue().equals("Nur-Sultan")) && (ToPicker.getValue().equals("Kokshetau"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            hide3();
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            FlyTime1.setText("~3 hours");
            FlyTime2.setText("~3 hours");
            Time1.setText("16:15");
            Time2.setText("13:38");
            FinalTime1.setText("19:17");
            FinalTime2.setText("16:26");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(16, 15, 3, 2));
            FinalDate2.setText(FinalDate(13, 38, 2, 48));
            show2();
        }
        if ((FromPicker.getValue().equals("Semey")) && (ToPicker.getValue().equals("Kokshetau"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            hide3();
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            FlyTime1.setText("~9 hours");
            FlyTime2.setText("~9 hours");
            Time1.setText("10:12");
            Time2.setText("10:48");
            FinalTime1.setText("19:36");
            FinalTime2.setText("20:02");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(10, 12, 9, 24));
            FinalDate2.setText(FinalDate(10, 48, 9, 14));
            show2();
        }
        if ((FromPicker.getValue().equals("Kokshetau")) && (ToPicker.getValue().equals("Semey"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            hide3();
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            FlyTime1.setText("~9 hours");
            FlyTime2.setText("~9 hours");
            Time1.setText("20:06");
            Time2.setText("20:32");
            FinalTime1.setText("05:30");
            FinalTime2.setText("05:46");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(20, 06, 9, 24));
            FinalDate2.setText(FinalDate(20, 32, 9, 14));
            show2();
        }
        if ((FromPicker.getValue().equals("Kokshetau")) && (ToPicker.getValue().equals("Almaty"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            hide2();
            CompanyName1.setText("'Talgo'");
            FlyTime1.setText("~9 hours");
            Time1.setText("11:24");
            FinalTime1.setText("20:16");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(11, 24, 8, 52));
            show1();
        }
        if ((FromPicker.getValue().equals("Almaty")) && (ToPicker.getValue().equals("Kokshetau"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            hide2();
            CompanyName1.setText("'Talgo'");
            FlyTime1.setText("~9 hours");
            Time1.setText("20:46");
            FinalTime1.setText("05:38");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(20, 46, 8, 52));
            show1();
        }
        if ((FromPicker.getValue().equals("Nur-Sultan")) && (ToPicker.getValue().equals("Shymkent"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            hide2();
            CompanyName1.setText("'Talgo'");
            FlyTime1.setText("~8 hours");
            Time1.setText("13:14");
            FinalTime1.setText("21:11");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(13, 14, 7, 57));
            show1();
        }
        if ((FromPicker.getValue().equals("Shymkent")) && (ToPicker.getValue().equals("Nur-Sultan"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            hide2();
            CompanyName1.setText("'Talgo'");
            FlyTime1.setText("~8 hours");
            Time1.setText("21:41");
            FinalTime1.setText("05:38");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(21, 41, 7, 57));
            show1();
        }
        if ((FromPicker.getValue().equals("Semey")) && (ToPicker.getValue().equals("Nur-Sultan"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            CompanyName3.setText("'Talgo'");
            FlyTime1.setText("~7 hours");
            FlyTime2.setText("~7 hours");
            FlyTime3.setText("~5 hours");
            Time1.setText("9:52");
            Time2.setText("10:47");
            Time3.setText("11:07");
            FinalTime1.setText("17:19");
            FinalTime2.setText("18:03");
            FinalTime3.setText("16:29");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date3.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(9, 52, 7, 27));
            FinalDate2.setText(FinalDate(10, 47, 7, 16));
            FinalDate3.setText(FinalDate(11, 7, 5, 22));
            show3();
        }
        if ((FromPicker.getValue().equals("Nur-Sultan")) && (ToPicker.getValue().equals("Semey"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            CompanyName3.setText("'Talgo'");
            FlyTime1.setText("~7 hours");
            FlyTime2.setText("~7 hours");
            FlyTime3.setText("~5 hours");
            Time1.setText("17:49");
            Time2.setText("18:33");
            Time3.setText("16:59");
            FinalTime1.setText("01:16");
            FinalTime2.setText("01:49");
            FinalTime3.setText("22:21");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date3.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(17, 49, 7, 27));
            FinalDate2.setText(FinalDate(18, 33, 7, 16));
            FinalDate3.setText(FinalDate(16, 59, 5, 22));
            show3();
        }
        if ((FromPicker.getValue().equals("Semey")) && (ToPicker.getValue().equals("Almaty"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            CompanyName3.setText("'Talgo'");
            FlyTime1.setText("~12 hours");
            FlyTime2.setText("~12 hours");
            FlyTime3.setText("~10 hours");
            Time1.setText("12:21");
            Time2.setText("12:53");
            Time3.setText("11:42");
            FinalTime1.setText("00:34");
            FinalTime2.setText("00:57");
            FinalTime3.setText("21:38");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date3.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(12, 21, 12, 13));
            FinalDate2.setText(FinalDate(12, 53, 12, 4));
            FinalDate3.setText(FinalDate(11, 42, 9, 56));
            show3();
        }
        if ((FromPicker.getValue().equals("Almaty")) && (ToPicker.getValue().equals("Semey"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            CompanyName3.setText("'Talgo'");
            FlyTime1.setText("~12 hours");
            FlyTime2.setText("~12 hours");
            FlyTime3.setText("~10 hours");
            Time1.setText("01:04");
            Time2.setText("01:27");
            Time3.setText("22:08");
            FinalTime1.setText("13:17");
            FinalTime2.setText("13:31");
            FinalTime3.setText("08:04");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date3.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(1, 4, 12, 13));
            FinalDate2.setText(FinalDate(1, 27, 12, 4));
            FinalDate3.setText(FinalDate(22, 8, 9, 56));
            show3();
        }
        if ((FromPicker.getValue().equals("Almaty")) && (ToPicker.getValue().equals("Shymkent"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            CompanyName3.setText("'Talgo'");
            FlyTime1.setText("~6 hours");
            FlyTime2.setText("~6 hours");
            FlyTime3.setText("~5 hours");
            Time1.setText("10:18");
            Time2.setText("10:37");
            Time3.setText("11:02");
            FinalTime1.setText("16:16");
            FinalTime2.setText("16:30");
            FinalTime3.setText("15:01");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date3.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(10, 18, 5, 58));
            FinalDate2.setText(FinalDate(10, 37, 5, 53));
            FinalDate3.setText(FinalDate(11, 02, 4, 59));
            show3();
        }
        if ((FromPicker.getValue().equals("Shymkent")) && (ToPicker.getValue().equals("Almaty"))) {
            sorry.setVisible(false);
            errDirect.setVisible(false);
            CompanyName1.setText("Platzkart");
            CompanyName2.setText("Coupe");
            CompanyName3.setText("'Talgo'");
            FlyTime1.setText("~6 hours");
            FlyTime2.setText("~6 hours");
            FlyTime3.setText("~5 hours");
            Time1.setText("16:46");
            Time2.setText("17:00");
            Time3.setText("15:31");
            FinalTime1.setText("22:44");
            FinalTime2.setText("22:53");
            FinalTime3.setText("20:30");
            Date1.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date2.setText(getDay() + "-" + getMonth() + "-" + getYear());
            Date3.setText(getDay() + "-" + getMonth() + "-" + getYear());
            FinalDate1.setText(FinalDate(16, 46, 5, 58));
            FinalDate2.setText(FinalDate(17, 0, 5, 53));
            FinalDate3.setText(FinalDate(15, 31, 4, 59));
            show3();
        }
        if (FromPicker.getValue().equals("Kokshetau") && ToPicker.getValue().equals("Shymkent")) {
            errDirect.setVisible(false);
            hide1();
            sorry.setVisible(true);
        }
        if (FromPicker.getValue().equals("Shymkent") && ToPicker.getValue().equals("Kokshetau")) {
            errDirect.setVisible(false);
            hide1();
            sorry.setVisible(true);
        }
        if (FromPicker.getValue().equals("Semey") && ToPicker.getValue().equals("Shymkent")) {
            errDirect.setVisible(false);
            hide1();
            sorry.setVisible(true);
        }
        if (FromPicker.getValue().equals("Shymkent") && ToPicker.getValue().equals("Semey")) {
            errDirect.setVisible(false);
            hide1();
            sorry.setVisible(true);
        }
        if (FromPicker.getValue().equals(ToPicker.getValue())){
            sorry.setVisible(false);
            hide1();
            errDirect.setVisible(true);
        }
    }

    public String FinalDate(int fromHour, int fromMinute, int hour, int minute) {
        int FinalDay = getDay(), FinalMonth = getMonth(), FinalYear = getYear(), FinalHour = fromHour, FinalMinute = fromMinute;
        if ((FinalMinute + minute) > 59) {
            FinalHour++;
            FinalMinute = FinalMinute - 60;
        }
        if ((FinalHour + hour) > 23) {
            FinalDay++;
            FinalHour = FinalHour-24;
        }
        if (FinalDay > 31 && (FinalMonth == 1 || FinalMonth == 3 || FinalMonth == 5 || FinalMonth == 7 || FinalMonth == 8 || FinalMonth == 10 || FinalMonth == 12)) {
            FinalMonth++;
            FinalDay=FinalDay-31;
        }
        if (FinalDay > 30 && (FinalMonth == 4 || FinalMonth == 6 || FinalMonth == 9 || FinalMonth == 11)) {
            FinalMonth++;
            FinalDay=FinalDay-30;
        }
        if (FinalDay > 29 && FinalMonth == 2 && ((FinalYear%4==0 && FinalYear%100!=0)||(FinalYear%100==0 && FinalYear%400==0))) {
            FinalMonth++;
            FinalDay=FinalDay-29;
        }
        if (FinalDay > 28 && FinalMonth == 2) {
            FinalMonth++;
            FinalDay=FinalDay-28;
        }
        if (FinalMonth > 12) {
            FinalYear++;
            FinalMonth=FinalMonth- 12;
        }

        return (FinalDay+"-"+FinalMonth+"-"+FinalYear);
    }

}