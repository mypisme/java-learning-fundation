import java.util.HashSet;
import java.util.Iterator;

public class SetStructure {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();

        strSet.add("hello");
        strSet.add("world");
        strSet.add("is");
        strSet.add("good");

        System.out.println(strSet);
        System.out.println("----------------");

        Iterator<String> iterator = strSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");
        for (String s : strSet) {
            System.out.println(s);
        }
        System.out.println("----------------");
        strSet.forEach(System.out::println);
        System.out.println("----------------");


    }
}
