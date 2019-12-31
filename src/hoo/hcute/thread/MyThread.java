package hoo.hcute.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : 这是一个线程的方法体");
    }

    public void sayHi(){
        System.out.println(Thread.currentThread().getName() + ": hello Thread");
    }
}
