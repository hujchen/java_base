package hoo.hcute.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("这还是一个线程");
        return 123;
    }
}
