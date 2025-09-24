package orderStudent;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    // 随机点名 并添加简单概率
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<Integer> probabilityNum = new ArrayList<>();
        Collections.addAll(studentList, "男一", "男二", "男三", "男四", "男五", "男六", "男七", "男八", "男九", "男十");
        Collections.addAll(studentList, "女一", "女二", "女三", "女四", "女五", "女六", "女七", "女八", "女九", "女十");
        Collections.addAll(probabilityNum, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);


        // 再打乱学生表，取出第一个值
        double boyCount = 0;
        for (int i = 0; i < 100; i++) {
            // 打乱概率表并取出第一个值
            Collections.shuffle(probabilityNum);
            if (probabilityNum.getFirst() == 1) {
                boyCount++;
            }
            Collections.shuffle(studentList);
        }
        System.out.println(boyCount / 100);
    }
}
