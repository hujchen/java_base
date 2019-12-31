package hoo.hcute.chapter3;

public class ShiftTest1 {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int z = x << 1;
        System.out.println(Integer.toBinaryString(z));
        for (int i = 0; i < 32 ; i++) {
             z  >>>= 1;
            System.out.println(Integer.toBinaryString(z));
        }
    }
}
