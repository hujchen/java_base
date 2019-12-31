package hoo.hcute.chapter11.matter5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {

    public static void main(String[] args) {
        Random random = new Random(47);
        List<Integer> lists = new ArrayList<>();
        lists.add(random.nextInt(10));
        lists.add(random.nextInt(10));
        lists.add(random.nextInt(10));
        lists.add(random.nextInt(10));
        lists.add(random.nextInt(10));
        lists.add(random.nextInt(10));
        lists.add(random.nextInt(10));
        lists.add(random.nextInt(10));
        lists.add(random.nextInt(10));
        lists.add(random.nextInt(10));
        System.out.println("1: " + lists);

        Integer pet = 11;
        lists.add(pet);
        System.out.println("2: " + lists);
        System.out.println("3: " + lists.contains(pet));
        Integer integer = lists.get(2);
        System.out.println("4: " + integer + " " + lists.indexOf(integer));
        Integer cymric = 12;
        System.out.println("5: " + lists.indexOf(cymric));
        System.out.println("6: " + lists.remove(cymric));
        System.out.println("7: " + lists.remove(pet));
        System.out.println("8: " +lists);


    }
}
