package qiangHongBao;

import java.util.Collections;

public class Person extends Thread {
    // 抢红包的人


    public Person(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (HongBao.lock) {
                if (HongBao.list.size() == 0) {
                    System.out.println(getName() + " 没抢到");
                    break;
                }
                Collections.shuffle(HongBao.list);
                System.out.println(getName() + "抢到了红包，金额为:" + HongBao.list.getFirst());
                HongBao.list.remove(HongBao.list.getFirst());
                break;
            }
        }
    }
}
