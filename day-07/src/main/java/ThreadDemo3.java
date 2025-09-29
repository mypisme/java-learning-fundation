import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallAble myCallAble = new MyCallAble();
        FutureTask<Integer> futureTask = new FutureTask<>(myCallAble);

        Thread thread = new Thread(futureTask);
        thread.start();

        Integer o = futureTask.get();
        System.out.println(o);
    }
}
