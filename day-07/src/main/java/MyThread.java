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
            try {
                if (ticket < 100) {
                    System.out.println(Thread.currentThread().getName() + ": " + ticket);
                    Thread.sleep(1000);
                    ticket++;
                } else {
                    break;
                }
            } catch (RuntimeException | InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
