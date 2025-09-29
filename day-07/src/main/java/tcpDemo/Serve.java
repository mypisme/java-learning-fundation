package tcpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Serve {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();

        int b;
        while ((b = inputStream.read()) != -1) {
            System.out.print((char) b);
        }
        serverSocket.close();
        inputStream.close();
    }
}
