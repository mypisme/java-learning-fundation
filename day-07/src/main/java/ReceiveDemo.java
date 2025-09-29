import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10083);

        DatagramPacket dp = new DatagramPacket(new byte[10], 10);

        ds.receive(dp);

        System.out.println(dp.getAddress() + String.valueOf(dp.getLength()) + "@" + dp.getPort() + "@" + new String(dp.getData()));
    }
}
