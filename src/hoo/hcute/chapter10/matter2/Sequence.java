package hoo.hcute.chapter10.matter2;

import hoo.hcute.chapter10.matter4.Select;

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object x){
        if (next < items.length){
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length){
                i++;
            }
        }

        public Sequence doThis(){
            return Sequence.this;
        }
    }

    private class ReverseSequenceSelector implements Selector{

        private int i = items.length;

        @Override
        public boolean end() {
            return i == 0;
        }

        @Override
        public Object current() {
            return items[i-1];
        }

        @Override
        public void next() {
            if (i > 0) {
                i--;
            }
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public Selector reverseSelector(){return new ReverseSequenceSelector();}

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10 ; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }

        System.out.println();
        Selector selector1 = sequence.reverseSelector();
        while (!selector1.end()){
            System.out.print(selector1.current() + " ");
            selector1.next();
        }
    }
}
