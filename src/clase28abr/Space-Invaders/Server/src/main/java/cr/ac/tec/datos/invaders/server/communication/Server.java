package cr.ac.tec.datos.invaders.server.communication;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    private static final int PORT = 9000;
    private static final int BUFFER_SIZE = 1024;

    private ServerSocket socket;
    private boolean isActive = true;

    public Server() throws IOException {
        this.socket = new ServerSocket(PORT);
    }
    public void run() throws IOException {
        System.out.println("Server ready for connections");
        while (this.isActive) {
            try (
                    var inboundConnection = this.socket.accept();
                    var reader = new InputStreamReader(inboundConnection.getInputStream());
                    var writer = new OutputStreamWriter(inboundConnection.getOutputStream());
            ) {
                String data = this.readMessage(reader);
                System.out.println(data);
                if (!data.startsWith("OP")) {
                    System.out.println("Invalid data received from client: " + data);
                    writer.write("Malformed request");
                    writer.flush();
                    writer.close();
                    continue;
                }
                writer.write("ACK");
                writer.flush();
                writer.close();
            }
        }
    }

    private String readMessage(InputStreamReader reader) throws IOException {
        StringBuilder messageBuilder = new StringBuilder();
        char[] buffer = new char[BUFFER_SIZE];
        int c;
        while (reader.read(buffer, 0, BUFFER_SIZE) != -1) {
            messageBuilder.append(buffer);
        }
        return messageBuilder.toString();
    }

    public void stop() {
        this.isActive = false;
    }
}
