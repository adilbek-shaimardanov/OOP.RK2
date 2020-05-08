package Networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    Scanner scan = new Scanner(System.in);
    static Socket clientSocket = new Socket("localhost", 6000);
    static ObjectOutputStream output = new ObjectOutputStream(clientSocket.getOutputStream());
    static ObjectInputStream input = new ObjectInputStream(clientSocket.getInputStream());

    public Client() throws IOException {
    }

    public void sendMessage(String text) throws IOException {
        Request request = new Request("user", null, text, null);
        output.writeObject(request);

    }
}
