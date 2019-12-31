package hcute.hoo.day02;

public class Test1_DataType {

    public static void main(String[] args) {
        float f = 12.3f;
        long x = 12345;

//        f = x;
//        System.out.println(f);
        x = (long)f;
        System.out.println(x);

        /*
         float 占4字节 ，long 占8个字节 但是 float 的范围比long 大
         float 占四个字节，32个二进制位
         1位代表符号位
         23位代表尾数位【也就是小数位】
         8位代表指数位 00000000 - 11111111  =》 0 - 255 ，
         这里符合IEEE 754 规范【0代表0，255代表无穷大，1～254 每个指数要减去127为 -126～127】
         */

    }
}
