package hoo.hcute.chapter10.matter7;

public class ClassInterfaceImpl1 implements ClassInterface {
    @Override
    public void howdy() {
        System.out.println("impl howdy!");
    }


    public static void main(String[] args) {
        ClassInterfaceImpl1 clf1 = new ClassInterfaceImpl1();
        ClassInterface.Test.print(clf1);
    }

}
