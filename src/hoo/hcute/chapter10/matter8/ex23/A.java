package hoo.hcute.chapter10.matter8.ex23;

public class A {

    U info(){
        return new U(){
            @Override
            public void a1() {
                System.out.println("A.U.a1");
            }

            @Override
            public void a2() {
                System.out.println("A.U.a2");
            }

            @Override
            public String a3() {
                return "I ama A.U";
            }
        };
    }
}
