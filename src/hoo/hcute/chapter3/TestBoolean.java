package hoo.hcute.chapter3;

public class TestBoolean {

    static void compareString(String a,String b){
        if (a==b) System.out.println("a=b");
        if (a!=b) System.out.println("a!=b");
        if (a.equals(b)) System.out.println("a.equals(b)");

    }

    public static void main(String[] args) {
        String a="123";
        String b="123";
        compareString(a,b);
    }
}
