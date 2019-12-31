package hoo.hcute.chapter5;

public class PrimitiveOverloading {

    void f1(byte x) {
        System.out.println("f1(byte)");
    }

    void f1(char x) {
        System.out.println("f1(char)");
    }

    void f1(short x) {
        System.out.println("f1(short)");
    }

    void f1(int x) {
        System.out.println("f1(int)");
    }

    void f1(long x) {
        System.out.println("f1(long)");
    }

    void f1(float x) {
        System.out.println("f1(float)");
    }

    void f1(double x) {
        System.out.println("f1(double)");
    }



    void f2(byte x) {
        System.out.println("f2(byte)");
    }

    void f2(short x) {
        System.out.println("f2(short)");
    }

    void f2(int x) {
        System.out.println("f2(int)");
    }

    void f2(long x) {
        System.out.println("f2(long)");
    }

    void f2(float x) {
        System.out.println("f2(float)");
    }

    void f2(double x) {
        System.out.println("f2(double)");
    }



    void f3(short x) {
        System.out.println("f3(short)");
    }

    void f3(int x) {
        System.out.println("f3(int)");
    }

    void f3(long x) {
        System.out.println("f3(long)");
    }

    void f3(float x) {
        System.out.println("f3(float)");
    }

    void f3(double x) {
        System.out.println("f3(double)");
    }



    void f4(int x) {
        System.out.println("f4(int)");
    }

    void f4(long x) {
        System.out.println("f4(long)");
    }

    void f4(float x) {
        System.out.println("f4(float)");
    }

    void f4(double x) {
        System.out.println("f4(double)");
    }


    void f5(long x) {
        System.out.println("f5(long)");
    }


    void f6(float x) {
        System.out.println("f6(float)");
    }

    void f6(double x) {
        System.out.println("f6(double)");
    }

    void f7(double x) {
        System.out.println("f7(double)");
    }

    public static void main(String[] args) {
        System.out.print("char:" );
        PrimitiveOverloading p = new PrimitiveOverloading();
        p.f1('c');
        p.f2('c');
        p.f3('c');
        p.f4('c');
        p.f5('c');
        p.f6('c');
        p.f7('c');
    }
}
