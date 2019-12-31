package hoo.hcute.chapter3;


public class Fibonacci {
    public static void main(String[] args) {
//        int num = 100;
//        long[] fibs = new long[num];
//
//        fibs[0] = 1;
//        fibs[1] = 1;
//        for (int i = 2 ; i < num ; i++) {
//            fibs[i] = fibs[i-1] + fibs[i-2];
//        }
//
//        for (long fib : fibs) {
//            System.out.println(fib);
//        }
        int c1 = 1;
        int c2 = 1;
        int c3;
        for (int i =0 ; i< 10; i ++){
            if (i < 2) {
                System.out.println(c1);
                continue;
            }
            c3 = c1 + c2;
            c1 = c2;
            c2 = c3;
            System.out.println(c3);
        }


    }
}
