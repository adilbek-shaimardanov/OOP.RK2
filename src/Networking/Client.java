package Networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;
import java.util.prefs.Preferences;

public class Client {
    Scanner scan = new Scanner(System.in);
    Socket clientSocket;
    ObjectOutputStream output;
    ObjectInputStream input;


    public Client() throws IOException {
        clientSocket = new Socket("localhost", 6000);
        output = new ObjectOutputStream(clientSocket.getOutputStream());
        input = new ObjectInputStream(clientSocket.getInputStream());
    }

    public void sendMessage(String text) throws IOException {
        Date date = new Date();
        Preferences pref = Preferences.userRoot().node("/src");
        String preference = pref.get("login", "");
        Request request = new Request("user", preference, text, date);
        output.writeObject(request);

    }
}
