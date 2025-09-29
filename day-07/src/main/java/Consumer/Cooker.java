package Consumer;

public class Cooker extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.foodNum == 0) {
                    // 不能再做饭了
                    System.out.println("饭已做完，无法继续");
                    break;
                } else {
                    if (Desk.foodLog == 0) {
                        // 桌子上没有饭，需要做饭
                        Desk.foodLog = 1;
                        System.out.println("厨师正在做饭，还需要做" + (Desk.foodNum - 1) + "碗饭");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        Desk.lock.notify(); // 唤醒吃货来吃饭
                    } else {
                        // 桌子上有饭，无需做饭，需要等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
