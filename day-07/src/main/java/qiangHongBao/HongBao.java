package qiangHongBao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HongBao {

    public static final Object lock = new Object();

    public static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        Collections.addAll(list, 50, 30 ,20);

        Person person1 = new Person("第一个人");
        Person person2 = new Person("第二个人");
        Person person3 = new Person("第三个人");
        Person person4 = new Person("第四个人");
        Person person5 = new Person("第五个人");

        ArrayList<Person> persons = new ArrayList<>();
        Collections.addAll(persons, person1, person2, person3, person4, person5);
        Collections.shuffle(persons);
        for (Person person : persons) {
            person.start();
        }


    }
}
