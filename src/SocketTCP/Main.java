package SocketTCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket cliente1 = null;
        Socket cliente2 = null;
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("Server started " + serverSocket.getLocalPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
        cliente1 = serverSocket.accept();
        cliente2 = serverSocket.accept();
        System.out.println("Cliente 1 conectado");
        System.out.println("Cliente 2 conectado");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
