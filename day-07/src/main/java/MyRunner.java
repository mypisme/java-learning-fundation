public class MyRunner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String thread = Thread.currentThread().getName();
            System.out.println(thread + "MyRunner: " + i);
        }
    }
}
