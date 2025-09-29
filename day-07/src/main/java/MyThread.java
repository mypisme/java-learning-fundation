import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int ticket = 0;

    public MyThread() {
    }

    static final Lock lock = new ReentrantLock();

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket < 100) {
                System.out.println(Thread.currentThread().getName() + ": " + ticket);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket++;
            } else {
                break;
            }
            lock.unlock();
        }
    }
}
