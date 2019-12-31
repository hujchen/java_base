package hoo.hcute.chapter3;

public class ShiftTest2 {

    public static void main(String[] args) {
        char[] chars = new char[]{'a','b','c'};
        for (char aChar : chars) {
            System.out.println(char2Binary(aChar));
        }
    }

    static String char2Binary(char c){
        String s = Integer.toBinaryString(c);
        return s;
    }
}
