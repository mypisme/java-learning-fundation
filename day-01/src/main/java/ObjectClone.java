import java.util.Arrays;

public class ObjectClone {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4};
        Integer[] ints1 = Arrays.copyOf(ints, ints.length);
        Arrays.sort(ints1,(Integer a, Integer b)->{
            return b-a;
        });
        System.out.println(Arrays.toString(ints1));
    }
}
