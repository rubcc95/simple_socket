
import java.io.*;
import java.net.*;

public class Client {
    public static final int port = 12345;
    public static final String host = "localhost";

    public static void main(String[] args) throws Exception {
        try(Socket socket = new Socket(host, port); //Lockea hasta conectarse o fallar
            var obj = new ObjectOutputStream(socket.getOutputStream());
        ) {
            obj.writeObject(new Message("ruben", "Hola mundo"));  
        }
    }
}