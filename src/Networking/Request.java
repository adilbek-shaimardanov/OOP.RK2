package Networking;

import java.io.Serializable;
import java.util.Date;

public class Request implements Serializable {
    private String receiver;
    private String sender;
    private String message;
    private Date date;

    public Request(String receiver, String sender, String message, Date date) {
        this.receiver = receiver;
        this.sender = sender;
        this.message = message;
        this.date = date;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Request{" +
                "receiver='" + receiver + '\'' +
                ", sender='" + sender + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
