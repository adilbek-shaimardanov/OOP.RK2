import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6000);

            while (true) {
                try {
                    System.out.println("Server open");
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("Add new client");
                    Thread thread = new ServerThead(clientSocket);
                    thread.start(); //start thread
                } catch (Exception err) {
                    err.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
