package genericsDemo;

import genericsDemo.cat.BosiCat;
import genericsDemo.cat.Cat;
import genericsDemo.cat.LihuaCat;
import genericsDemo.dog.Dog;
import genericsDemo.dog.HashiqiDog;
import genericsDemo.dog.TaidiDog;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BosiCat bosiCat = new BosiCat("加菲", 4);
        LihuaCat lihuaCat = new LihuaCat("大咪", 5);

        HashiqiDog hashiqiDog = new HashiqiDog("二郎神", 3);
        TaidiDog taidiDog = new TaidiDog("芘娃娃", 2);
        ArrayList<Cat> zomCat = new ArrayList<>();
        ArrayList<Dog> zomDog = new ArrayList<>();
        zomCat.add(bosiCat);
        zomCat.add(lihuaCat);
        zomDog.add(hashiqiDog);
        zomDog.add(taidiDog);


        keepPeet(zomCat);
        keepPet(zomDog);
    }

    private static void keepPeet(ArrayList<? extends Cat> zoom) {
        for (Animal animal : zoom) {
            System.out.println(animal.toEat());
        }
    }

    private static void keepPet(ArrayList<? extends Dog> zoom) {
        for (Animal animal : zoom) {
            System.out.println(animal.toEat());
        }
    }
}
