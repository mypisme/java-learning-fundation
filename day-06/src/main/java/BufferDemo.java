import java.io.*;
import java.util.TreeMap;

public class BufferDemo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public BufferDemo() {
    }
    // 缓冲流
    // 效率高于基本流,自带长度为8192的缓冲区
    public static void main(String[] args) throws IOException {
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\临时\\简历-马有鹏-软件开发工程师.pdf"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\临时\\简历-马有鹏-软件开发工程师COPY.pdf"));
//
//        int b;
//        while ((b = bis.read()) != -1) {
//            bos.write(b);
//        }
//        bis.close();
//        bos.close();
//        bufferReader();
//        test3();
        test4();
    }

    public static void bufferReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\临时\\简历-马有鹏-软件开发工程师.pdf"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\临时\\简历-马有鹏-软件开发工程师copy1.pdf"));
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
            bufferedWriter.write(s);
        }
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static void test3() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\临时\\test3.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\临时\\test3_A.txt"));

        String s;
        TreeMap<Integer, String> orderMap = new TreeMap<>();
        while ((s = bufferedReader.readLine()) != null) {
            String[] tempStr = s.split("\\.");
            orderMap.put(Integer.parseInt(tempStr[0]), tempStr[1]);
        }
        orderMap.values().forEach(value -> {
            try {
                bufferedWriter.write(value);
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static void test4() throws IOException {

        File file = new File("D:\\临时\\test4.txt");
        BufferedReader bufferedReader;
        if (!file.exists()) {
            file.createNewFile();
        }
        bufferedReader = new BufferedReader(new FileReader(file));
        String s = bufferedReader.readLine();
        int runTime;

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\临时\\test4.txt"));

        if (s == null) {
            // 程序第一次运行
            System.out.println("欢迎使用本软件，程序第" + 1 + "次运行免费");
            bufferedWriter.write(String.valueOf(1));
            System.out.println("程序运行中！");
        } else {
            // 后几次运行
            runTime = Integer.parseInt(s);
            runTime += 1;
            if (runTime <= 3) {
                System.out.println("欢迎使用本软件，程序第" + runTime + "次运行免费");
                bufferedWriter.write(String.valueOf(runTime));
                System.out.println("程序运行中！");
            } else {
                runTime -= 1;
                System.out.println("本软件只能免费使用" + runTime + "次，请充值会员");
                bufferedWriter.write(String.valueOf(runTime));
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
