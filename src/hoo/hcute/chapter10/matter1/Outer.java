package hoo.hcute.chapter10.matter1;

public class Outer {

    private String s;

    public Outer() {
        System.out.println("outer constructor");
    }

    class Inner{

        public Inner() {
            s = "123";
            System.out.println("inner constructor");
        }
    }

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner();
    }
}
