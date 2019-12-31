package hoo.hcute.chapter11.matter1.ex3;

import hoo.hcute.chapter10.matter2.Sequence;

import java.util.ArrayList;

interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Sequence3 {

    private ArrayList<Object> items = new ArrayList<>();

    public void add(Object x){
        items.add(x);
    }

    private class Sequence3Selector implements Selector{

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            i++;
        }
    }

    public Selector selector(){
        return new Sequence3Selector();
    }

    public static void main(String[] args) {
        Sequence3 sequence3 = new Sequence3();
        for (int i = 0; i < 10 ; i++) {
            sequence3.add(i);
        }
        Selector selector = sequence3.selector();

        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();;
        }

        sequence3.add(10);
        sequence3.add(11);
        sequence3.add(12);
        sequence3.add(13);
        sequence3.add(14);
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();;
        }
    }
}
