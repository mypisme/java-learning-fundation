import java.util.*;
import java.util.stream.Collectors;

public class Immutable {
    public static void main(String[] args) {
//        List<Integer> integers = List.of(1, 2, 3);
//
//        System.out.println( integers);
//
//        Set<Integer> s = Set.of(1, 2, 3);
//
//        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
//        objectObjectHashMap.put(1, 1);
//        objectObjectHashMap.put(2, 2);
//        objectObjectHashMap.put(3, 3);
//        objectObjectHashMap.put(4, 4);
//        objectObjectHashMap.put(5, 5);
//        objectObjectHashMap.put(6, 6);
//        objectObjectHashMap.put(7, 7);
//
//        Set<Map.Entry<Object, Object>> entries = objectObjectHashMap.entrySet();
//
//        Map.ofEntries(objectObjectHashMap.entrySet().toArray(new Map.Entry[0]));
//        Map.copyOf(objectObjectHashMap);


        main2();
    }

    public static void main1() {
        ArrayList<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, "张三丰", "张三丰", "张三五", "张三六", "张三七", "张三八", "张三九", "张三十");

        HashMap<String, String> nameMap = new HashMap<>();
        nameMap.put("张三的名字", "张三");
        nameMap.put("张三丰的名字", "张三丰");
        nameMap.put("张三五的名字", "张三五");
        nameMap.put("张三六的名字", "张三三");

        //nameMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
        System.out.println("-----------------");

        int[] nameNum = new int[10];
        for (int i = 0; i < nameNum.length; i++) {
            nameNum[i] = i;

        }
        //Arrays.stream(nameNum).forEach(name -> System.out.println(name+"*");ln);

        //过滤
        nameList.stream().filter(name -> name.startsWith("张")).forEach(name -> System.out.print(name + "*"));
        System.out.println();
        System.out.println("-----------------");
        nameList.stream().
                filter(name -> name.startsWith("张")).
                filter(name -> name.length() == 3).
                filter(name -> name.endsWith("五")).
                forEach(name -> System.out.print(name + "*"));
        System.out.println("-----------------");
        nameList.stream().limit(6).skip(3).forEach(name -> System.out.print(name + "*"));
        System.out.println("-----------------");
        nameList.stream().distinct().forEach(name -> System.out.print(name + "*"));
        System.out.println("-----------------");
        ArrayList<String> nameWithAge = new ArrayList<>();
        Collections.addAll(nameWithAge, "张三丰:10", "张三五:11", "张三六:12", "张三七:13", "张三八:14", "张三九:15", "张三十:16", "张三十一:17", "张三十二:18", "张三十三:19", "张三十四:20");
        nameWithAge.stream().map(name -> {
            String[] split = name.split(":");
            return Integer.parseInt(split[1]);
        }).forEach(age -> System.out.print(age + "*"));
        System.out.println("-----------------");
        //  终结方法
        System.out.println(nameWithAge.stream().count());
        String[] array = nameWithAge.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array));
        System.out.println("------------------");
        Map<String, Integer> collect = nameWithAge.stream()
                .filter(name -> name.startsWith("张"))
                .collect(Collectors
                        .toMap(name -> name.split(":")[0], name -> {
                            String[] split = name.split(":");
                            return Integer.parseInt(split[1]);
                        }));
        System.out.println(collect);
    }
    
    public static void main2() {
        // test1
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNum = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);

    }
}
