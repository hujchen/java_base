package hoo.hcute.chapter10.matter7;

public class Ex21 implements In {
    @Override
    public String f() {
        return "hello";
    }

    @Override
    public String g() {
        return "friend";
    }

    public static void main(String[] args) {
        Ex21 x = new Ex21();
        In.Nested.testIn(x);
    }
}
