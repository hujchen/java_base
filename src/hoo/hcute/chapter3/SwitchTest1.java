package hoo.hcute.chapter3;

import java.util.Random;

public class SwitchTest1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            int x = new Random().nextInt(5) + 'a';
            switch (x) {
                case 'a' :
                    System.out.println("this is a");
//                    break;
                case 'b':
                    System.out.println("this is b");
//                    break;
                case 'c':
                    System.out.println("this is c");
//                    break;
                default:
                    System.out.println("this is d");
            }
            System.out.println("============");
        }

    }
}
