package hcute.hoo.day02;

public class Demo1_DataType {
    public static void main(String[] args) {
        // 整型
        byte b = 10; // 1个字节
        short s = 20; // 2个字节
        int i = 100; //占4个字节，整数默认的数据类型是int类型
        long l = 8888888888L; //占8个字节
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println(12345 + 5432L); // 如果long类型后面加l进行标示，最好加L，l和1太像了


        // 浮点型
        float f = 12.3f; // 占4个字节
        double d = 24.3; // 占8个字节 小数的默认数据类型
        System.out.println(f);
        System.out.println(d);

        // 字符型
        char c = 'a'; // 占2个字节
        System.out.println(c);

        // 布尔类型
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
    }
}
