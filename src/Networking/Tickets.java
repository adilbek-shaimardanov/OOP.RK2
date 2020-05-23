package Networking;

import javafx.scene.text.Text;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Tickets {
    private Integer id;
    private String direction;
    private int flyTime;
    private int price;
    private String trainType;
    private int carriage;
    private int spot;
    private LocalDate flyDate;
    private LocalTime flyTimeDate;
    private LocalDate flyFinalDate;
    private LocalTime flyFinalTimeDate;
    private String privileges;

    public Tickets(Integer id, String direction, int flyTime, int price, Text trainType, int carriage, int spot, LocalDate flyDate, LocalTime flyTimeDate, LocalDate flyFinalDate, LocalTime flyFinalTimeDate, String privileges) {
        this.id = id;
        this.direction = direction;
        this.flyTime = flyTime;
        this.price = price;
        this.trainType = String.valueOf(trainType);
        this.carriage = carriage;
        this.spot = spot;
        this.flyDate = flyDate;
        this.flyTimeDate = flyTimeDate;
        this.flyFinalDate = flyFinalDate;
        this.flyFinalTimeDate = flyFinalTimeDate;
        this.privileges = privileges;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFlyDate() {
        return flyDate;
    }

    public void setFlyDate(LocalDate flyDate) {
        this.flyDate = flyDate;
    }

    public LocalTime getFlyTimeDate() {
        return flyTimeDate;
    }

    public void setFlyTimeDate(LocalTime flyTimeDate) {
        this.flyTimeDate = flyTimeDate;
    }

    public LocalDate getFlyFinalDate() {
        return flyFinalDate;
    }

    public void setFlyFinalDate(LocalDate flyFinalDate) {
        this.flyFinalDate = flyFinalDate;
    }

    public LocalTime getFlyFinalTimeDate() {
        return flyFinalTimeDate;
    }

    public void setFlyFinalTimeDate(LocalTime flyFinalTimeDate) {
        this.flyFinalTimeDate = flyFinalTimeDate;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public int getSpot() {
        return spot;
    }

    public void setSpot(int spot) {
        this.spot = spot;
    }

    public Tickets(Integer id, String direction, int flyTime, int price, String trainType, int carriage, int spot, Date flyDate, Time flyTimeDate, Date flyFinalDate, Time flyFinalTimeDate, String privileges) {
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getFlyTime() {
        return flyTime;
    }

    public void setFlyTime(int flyTime) {
        this.flyTime = flyTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }
}
