import java.util.Arrays;

public class LamdaExc {
    public static void main(String[] args) {
        String[] arr = {"a","bbv","csadf"};
        Arrays.sort(arr, (String a, String b)-> b.length() - a.length());
        System.out.println(Arrays.toString(arr));
    }

}
