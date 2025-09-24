package orderStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    // 随机学生点名
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        Collections.addAll(studentList, "张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十");

        Random random = new Random();
        int index = random.nextInt(studentList.size());
        System.out.println(studentList.get(index));

        Collections.shuffle(studentList);
        System.out.println(studentList.getFirst());
    }
}
