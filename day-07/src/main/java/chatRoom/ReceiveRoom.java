package chatRoom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveRoom {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10083);

        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ds.receive(dp);

            byte[] data = dp.getData();
            InetAddress address = dp.getAddress();
            int length = dp.getLength();
            String hostName = dp.getAddress().getHostName();

            System.out.println(new String(data, 0, length) + " " + hostName + " " + address);
            if (new String(data, 0, length).equals("886")) {
                break;
            }
        }
        ds.close();

    }
}
