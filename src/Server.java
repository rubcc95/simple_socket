
import java.io.*;
import java.net.*;

public class Server {
    public static final int port = 12345;

    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            var socket = serverSocket.accept(); // lockea hasta que alguien se conecte
            var obj = new ObjectInputStream(socket.getInputStream());
            var a = (Message) obj.readObject();
            System.out.println("User " + a.user + " sent: " + a.text);

        }
    }
}
