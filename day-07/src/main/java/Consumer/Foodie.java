package Consumer;

public class Foodie extends Thread {
    // 消费者
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.foodNum == 0) {
                    // 已经不能再吃了
                    break;
                } else {
                    if (Desk.foodLog == 1) {
                        Desk.foodNum--;
                        // 桌子上有有食物可以吃
                        System.out.println("吃货正在吃东西， 还有" + Desk.foodNum + "碗饭可以吃");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        Desk.foodLog = 0;
                        // 吃完以后唤醒厨师来做饭
                        Desk.lock.notifyAll();
                    } else {
                        // 没有食物需要等待
                        try {
                            System.out.println("桌子上没有食物，需要等待");
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
