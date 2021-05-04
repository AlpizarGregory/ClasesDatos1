package main.java.cr.ac.tec.datos.invaders.client;

import main.java.cr.ac.tec.datos.invaders.client.communications.Sender;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        for (var i = 0; i < 10; i++) {
            Sender.sendData(9000, "localhost", "OP: Hola señor server" + i);
        }
        Sender.sendData(9000, "localhost", "OX: Hola señor server");
        Sender.sendData(9000, "localhost", "");
    }
}
