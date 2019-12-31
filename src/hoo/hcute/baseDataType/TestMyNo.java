package hoo.hcute.baseDataType;

public class TestMyNo {

    public static void main(String[] args) {
        byte[]  bi = new byte[]{0,0,12,13};

        int i = 0;

        for ( i = 0; i < bi.length && bi[i] == 0; i++); // 这种循环的使用，10年的程序编写中没有用过，请认证考虑自己

        System.out.println(i);

        int[] i1 = new int[2];
        for (int i2 : i1) {
            System.out.println(i2);
        }

        byte[] b2 = new byte[2];
        for (byte b : b2) {
            System.out.println(b);
        }
        
        char[] c2 = new char[2];
        for (char c : c2) {
            System.out.println(c);
        }

        Integer[] c1 = new Integer[2];
        for (Integer integer : c1) {
            System.out.println(integer);
        }


    }


    public static void testOxFF(){
        //1,
    }
}
