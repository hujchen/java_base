package hoo.hcute.chapter5;

public class FinalizeTestOne {


    public static void main(String[] args) throws Throwable {

        FinalizeTestOne finalizeTestOne = new FinalizeTestOne();
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("对象被回收了");
    }
}
