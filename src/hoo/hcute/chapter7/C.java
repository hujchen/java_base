package hoo.hcute.chapter7;

/**
* @Description: C 类（或接口）是
* @Use: 父构造器先初始化，在初始化子类
* @Author: hcute
* @Date: 2019/12/24 11:27 上午
*/
public class C extends A {
    private B b = new B();

    public C() {
        System.out.println("C Constructor");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
