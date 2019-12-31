package hoo.hcute.chapter10.matter2;

public class Item {
    private String s;

    public Item(String s) {
        this.s = s;
    }

    public void print(){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);
        for (int i = 0; i < 5; i++) {
            sequence.add(new Item(""+i));
        }
        Selector selector = sequence.selector();

        while(!selector.end()){
            Item current = (Item)selector.current();
            current.print();
            selector.next();
        }
    }
}
