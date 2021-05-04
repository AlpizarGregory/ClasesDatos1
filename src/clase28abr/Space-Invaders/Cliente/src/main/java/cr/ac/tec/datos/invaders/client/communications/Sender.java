package main.java.cr.ac.tec.datos.invaders.client.communications;

import java.io.*;
import java.net.Socket;
import cr.ac.tec.datos.invaders.core.MessageReader;
import java.nio.charset.StandardCharsets;

public class Sender {
    private static final int BUFFER_SIZE = 1024;

    public static void sendData(int port, String host, String message) throws IOException {
        var outgoing = new Socket(host, port);
        try (
                var writer = new OutputStreamWriter(outgoing.getOutputStream());
                var reader = new InputStreamReader(outgoing.getInputStream());
                ) {
            writer.write(message);
            writer.flush();
            outgoing.shutdownOutput();
            var line = readMessage(reader);
            if (line.startsWith("ACK")) {
                System.out.println("Server accepted the request");
            } else {
                System.out.println("Server rejected the request");
            }
        }
    }
}
