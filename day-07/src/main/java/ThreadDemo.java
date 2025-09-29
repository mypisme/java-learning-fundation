public class ThreadDemo extends Thread {
    // 多线程 继承Thread
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread("线程1");
//        MyThread myThread1 = new MyThread("线程2");
//
//        myThread.start();
//        myThread1.start();
//    }
//    public static void main(String[] args) {
//        MyRunner myRunner = new MyRunner();
//
//        Thread t1 = new Thread(myRunner, "Thread1");
//        Thread t2 = new Thread(myRunner, "Thread2");
//
//
//        t1.setPriority(1);
//        t2.setPriority(10);
//        t1.start();
//        t2.start();
//
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("窗口1");
        MyThread myThread2 = new MyThread("窗口2");
        MyThread myThread3 = new MyThread("窗口3");

        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}
