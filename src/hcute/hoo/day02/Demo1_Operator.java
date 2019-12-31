package hcute.hoo.day02;

public class Demo1_Operator {
    public static void main(String[] args) {
//        int x = 3;
//        int b = x++;
//        int y = ++x;
//        System.out.println("x = " + x);
//        System.out.println("b = " + b);
//        System.out.println("y = " + y);

        int x =3;
        int y =4;
        System.out.println((++x == 3) & (++y == 4));
        System.out.println("x = "+x+",y="+y);
        System.out.println((++x == 3) && (++y == 4));
        System.out.println("x = "+x+",y="+y);

        System.out.println(-2 << 2);
    }
}
