package ConsumerDemo;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread {

    private ArrayBlockingQueue<String> queue;

    public Cooker(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = this.queue.take();
                System.out.println(take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
