import java.io.*;

public class StreamIODemo {
    // 转换流
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\临时\\转换流.txt"), "GBK");

        OutputStreamWriter fileOutputStream = new OutputStreamWriter(new FileOutputStream("D:\\临时\\转换流_1.txt"), "GBK");

        int c;
        while ((c = isr.read()) != -1) {
            fileOutputStream.write((char) c);
        }
        isr.close();
        fileOutputStream.close();

    }
}
