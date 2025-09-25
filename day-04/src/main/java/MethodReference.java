import java.util.Arrays;

public class MethodReference {
    public static void main(String[] args) {
        // 被引用的方法必须已经存在
        // 被引用方法的形参和返回值必须与引用方法一致
        // 被引用方法的功能要满足当前需求

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(array, new MethodReference()::compare);
        System.out.println(Arrays.toString(array));
    }

    public int compare(Integer a, Integer b) {
        return -a;
    }
}
