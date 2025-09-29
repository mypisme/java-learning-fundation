package chatRoom;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SeedRoom {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 打包数据
            System.out.println("请输入您要说的话：");
            String input = scanner.nextLine();
            byte[] bytes = input.getBytes();

            InetAddress address = InetAddress.getByName("DESKTOP-LC9N4FR");
            int port = 10083;

            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
            datagramSocket.send(dp);
            if (input.equals("886")){
                break;
            }
        }
        datagramSocket.close();
    }
}
