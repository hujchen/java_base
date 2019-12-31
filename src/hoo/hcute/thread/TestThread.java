package hoo.hcute.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 10  ; i++) {
//            testThread();
//            testCallable();
//
//        }
        MyExecutor myExecutor = new MyExecutor();
        myExecutor.testCachedThreadPool();
        System.out.println("===========");
        myExecutor.testFixedThreadPool();
        myExecutor.testSingleThreadExecutor();


    }

    public static void testThread(){
            MyThread myThread = new MyThread();
            myThread.sayHi();
            myThread.start();
    }

    public static void testRunnable(){
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void testCallable() throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }
}
