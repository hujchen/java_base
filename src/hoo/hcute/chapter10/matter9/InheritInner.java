package hoo.hcute.chapter10.matter9;

class WithInner{
    class Inner{}
}
public class InheritInner extends WithInner.Inner {
    public InheritInner(WithInner withInner) {
        withInner.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
