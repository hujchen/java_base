package hoo.hcute.chapter10.matter9;

class Outer{
    class Inner{
        private String name;

        public Inner(String name) {
            this.name = name;
        }
    }
}

class Outer1{
    class Inner1 extends Outer.Inner{
        public Inner1(Outer outer) {
            outer.super("hello");
        }
    }
}

public class Ex26 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner1 = outer1.new Inner1(outer);
    }
}
