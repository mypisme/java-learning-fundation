package Consumer;

public class Desk {

    public static int foodLog = 0;

    public static int foodNum = 10;

    public static final Object lock = new Object();

    // 控制生产者和消费执行
    public static void main(String[] args) {
        Cooker cooker = new Cooker();

        Foodie foodie = new Foodie();

        cooker.start();
        foodie.start();

    }
}
