import java.io.*;

public class ObjectStream {
    // 序列化流
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferDemo bufferDemo = new BufferDemo();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\临时\\转换流.txt"));

        objectOutputStream.writeObject(bufferDemo);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\临时\\转换流.txt"));
        Object o = objectInputStream.readObject();
        System.out.println(o);
        objectInputStream.close();

    }
}
