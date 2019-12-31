package hoo.hcute.chapter10.matter8.ex23;

public class Ex23 {
    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new A();
        A a2 = new A();
        B b = new B(3);
        b.addU(a0.info(),0);
        b.addU(a1.info(),1);
        b.addU(a2.info(),2);

        b.showUs();
        b.testUs();
        b.eraseU(0);
        b.eraseU(1);
        b.showUs();


    }
}
