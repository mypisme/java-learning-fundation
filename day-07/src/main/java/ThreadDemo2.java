public class ThreadDemo2 {
    public static void main(String[] args) {
        MyRunner myRunner = new MyRunner();

        Thread thread = new Thread(myRunner);
        Thread thread1 = new Thread(myRunner);

        thread.setName("1");
        thread1.setName("2");

        thread1.start();
        thread.start();

    }
}
