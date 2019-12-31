package hoo.hcute.chapter10.matter7;

public interface ClassInterface {

    void howdy();

    class Test {

        public static void print(ClassInterface cif) {
            cif.howdy();
        }
    }
}
