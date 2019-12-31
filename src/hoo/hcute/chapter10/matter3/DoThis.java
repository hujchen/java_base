package hoo.hcute.chapter10.matter3;

public class DoThis {
    void f(){
        System.out.println("DoThis.f()");
    }

    public class Inner {
        public DoThis outer(){
            return DoThis.this; // 返回外部类的引用
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis dt = new DoThis();
        System.out.println(dt);
        Inner inner = dt.inner();
        inner.outer().f();
        System.out.println(inner.outer());
    }
}
