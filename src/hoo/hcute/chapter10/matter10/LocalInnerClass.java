package hoo.hcute.chapter10.matter10;

public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name){
        class LocalInner implements Counter{

            public LocalInner() {
                System.out.println("LocalInner()");
            }

            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }

        }
        return new LocalInner();
    }


    Counter getCounter2(final String name){
        return new Counter() {

            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter local_inner = lic.getCounter("local inner");
        Counter anonymous_inner = lic.getCounter2("anonymous inner");

        for (int i = 0; i < 5; i++) {
            System.out.println(local_inner.next());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(anonymous_inner.next());
        }

    }

}
