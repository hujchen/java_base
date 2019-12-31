package hoo.hcute.chapter10.matter8.ex23;

public class B {
    private U[] us ;

    public B(int i ) {
        us = new U[i];
    }

    void addU(U u,int i){
        us[i] = u;
    }

    void eraseU(int i){
        us[i] = null;
    }

    void testUs(){
        for (U u : us) {
            u.a1();
            u.a2();
            u.a3();
        }
    }
    void showUs(){
        for (U u : us) {
            if (u !=null){
                System.out.println(u.a3());
            }else{
                System.out.println("I am null");
            }
        }
    }
}
