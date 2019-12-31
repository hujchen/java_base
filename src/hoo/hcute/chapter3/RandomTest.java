package hoo.hcute.chapter3;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        Random rand = new Random(47);

        for (int i = 0; i < 1000 ; i++) {
            System.out.println(rand.nextInt(2));
        }
    }
}
