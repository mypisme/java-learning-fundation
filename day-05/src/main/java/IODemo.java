import java.io.*;
import java.util.Arrays;

public class IODemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("day-05/src/main/java/myio/ao.txt", true);
//        fos.write(94);
//        fos.write(94);
//        fos.write("\r\n".getBytes());
//        String str = "hello world";
//        fos.write(str.getBytes());
//        fos.close();

        FileInputStream fis = new FileInputStream("D:\\临时\\祝福.mp4");
        FileOutputStream fos1 = new FileOutputStream("D:\\临时\\祝福1.mp4");

        byte[] bytes = new byte[1024*1024*12];
        int b;
        while ((b = fis.read(bytes)) != -1) {
//            fos1.write(bytes, 0, b);
        }
        fis.close();

        // UTF-8是Unicode的一种编码规则
        // 字符流
        String str = "### ai你们";
        System.out.println(Arrays.toString(str.getBytes("GBK")));
        FileReader fr = new FileReader("D:\\md_files\\GItHub SSH密钥.md");

        int l;
        while ((l = fr.read()) != -1){
            System.out.print((char) l);
        }
        fr.close();

        FileWriter frt = new FileWriter("D:\\md_files\\GItHub SSH密钥-test.md");
        frt.write(str);
        frt.close();

    }
}
