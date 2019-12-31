package hoo.hcute.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {

    void testCachedThreadPool(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }
        executorService.shutdown();
    }

    void testFixedThreadPool(){
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 5 ; i++) {
            executorService.execute(new MyRunnable());
        }
        executorService.shutdown();
    }

    void testSingleThreadExecutor(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable());
        }
        executorService.shutdown();
    }
}
