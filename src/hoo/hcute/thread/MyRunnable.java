package hoo.hcute.thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": 这还是一个线程");
    }

}
