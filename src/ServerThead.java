import Networking.Request;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThead extends Thread {
    Socket socket;

    public ServerThead(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (socket.isConnected()) {
                Request request = (Request) input.readObject();
                String message = request.getMessage();
                String receiver = request.getReceiver();
                String sender = request.getSender();
                String date = String.valueOf(request.getDate());
                System.out.println(sender+"("+date+")"+": "+message);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
