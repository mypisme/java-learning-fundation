import java.io.IOException;
import java.net.*;

public class NetDemo {
    public static void main(String[] args) throws IOException {
//        InetAddress allByName = InetAddress.getByName("DESKTOP-LC9N4FR");
//        System.out.println(allByName);

        DatagramSocket ds = new DatagramSocket();

        String str = "你好";
        byte[] buf = str.getBytes();
        InetAddress address = InetAddress.getByName("DESKTOP-LC9N4FR");
        int port = 10083;


        DatagramPacket dp = new DatagramPacket(buf, buf.length, address, port);

        ds.send(dp);

        ds.close();

    }
}
