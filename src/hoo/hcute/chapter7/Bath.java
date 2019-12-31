package hoo.hcute.chapter7;

public class Bath {

    private String s1 = "Happy", s2 = "Happy", // Initializing at point of definition
        s3,s4;

    private Soap csstille;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath");
        s3 = "Joy";
        toy = 3.14f;
        csstille = new Soap();
    } // Initializing at point of Instance



    @Override
    public String toString() {
        if (s4 == null) { // Delayed initialization
            s4 = "Joy";
        }
        return "s1= " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "catille = " + csstille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println("s4 = " + b.s4);
        System.out.println(b);
    }
}


class Soap{

    private String s;

    public Soap() {
        super();
        System.out.println("Soap()");
        s = "Constructed";
    }
}
