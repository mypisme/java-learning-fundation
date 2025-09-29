package ConsumerDemo;


import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {


    public static void main(String[] args) {

        ArrayBlockingQueue<String> strings = new ArrayBlockingQueue<>(1);

        Cooker cooker = new Cooker(strings);
        Foodie foodie = new Foodie(strings);

        cooker.start();
        foodie.start();

    }
}
