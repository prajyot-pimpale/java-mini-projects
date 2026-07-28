import java.io.*;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 5000);

        BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
        Thread receiveThread = new Thread(() -> {
                    try {
                        String message;
                        while ((message = serverReader.readLine()) != null) {
                            System.out.println(message);
                        }
                    } catch (IOException ignored) {
                    }
                });

        receiveThread.start();

        System.out.println("Connected to Chat Server.");

        String message;
        while ((message = keyboard.readLine()) != null) {
            writer.println(message);
        }

        socket.close();
    }
}