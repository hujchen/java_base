package hcute.hoo.day02;

public class Demo3_DataTypeConversion {

    public static void main(String[] args) {
        /*// 隐式转换
        int x = 3;
        byte b = 4;
        x = x + b;
        System.out.println(x);

        // 强制转换
        b = (byte)(b + x);*/

//        byte b = (byte)(126+4);
        /*
            126 的补码   00000000 00000000 00000000 01111110
            4的 补码     00000000 00000000 00000000 00000100
            相加         00000000 00000000 00000000 10000010
            反码         00000000 00000000 00000000 10000001
            原码         00000000 00000000 00000000 11111110 -126
         */
//        System.out.println(b);
        byte b1 = 3;
        byte b2 = 4;
//        byte b3 = b1 + b2; // 损失精度 变量只有在运行的时候才能确定类型
        /*
            从两方面
                1，byte与byte（或short）进行运算的时候，会提升为int类型，两个int 类型相加的结果也是int，int转为byte可能损失精度
                2，b1和b2 是两个变量，变量存储的值是变化的，在编译的时候无法判断里面具体的值，相加有个能会超出byte的取值范围
         */
        byte b4 = 3 + 4; //这个没有问题 java编译器有常量优化机制，编译的时候就算出了结果，并且发现范围在byte内则可以进行赋值




    }
}
