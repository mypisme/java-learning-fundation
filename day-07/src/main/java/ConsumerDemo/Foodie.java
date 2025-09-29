package ConsumerDemo;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.queue.put("饭");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
