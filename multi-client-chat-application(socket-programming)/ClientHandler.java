import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;

    public ClientHandler(Socket socket) throws IOException {
        this.socket = socket;
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(socket.getOutputStream(),true);
    }

    public void run() {
        try {
            writer.println("Welcome to Chat Server!");
            String message;

            while ((message =reader.readLine()) != null) {
                System.out.println(message);
                ChatServer.broadcast(message,this);
            }
        } catch (IOException e) {
            System.out.println("Client Disconnected.");
        } finally {
            try {
                socket.close();
            } catch (IOException ignored) {
            }
            ChatServer.removeClient(this);
        }
    }

    public void sendMessage(String message) {
        writer.println(message);
    }
}