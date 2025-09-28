import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintSteamDemo {
    // 打印流
    public static void main(String[] args) throws IOException {
        PrintStream printSteam = new PrintStream(new FileOutputStream("D:\\临时\\转换流.txt"), true, Charset.forName("GBK"));

        printSteam.println("啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
        printSteam.close();
    }
}
