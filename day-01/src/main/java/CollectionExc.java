import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionExc {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Object());
        objects.removeFirst();
        System.out.println(objects.size());

        System.out.println(objects.size());

        // 遍历方式
        for (Object object : objects) {
            return;
        }
        // 迭代器遍历完成后，指针不会复位
        // 如果要继续遍历，则需要重新获取迭代器

        List<Object> list = new ArrayList<>();
        list.add(new Object());
        ListIterator<Object> listIterator = list.listIterator();
    }
}
