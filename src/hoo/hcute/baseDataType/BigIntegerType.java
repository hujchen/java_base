package hoo.hcute.baseDataType;

import java.math.BigInteger;

public class BigIntegerType {

    public static void main(String[] args) {
//        byte[] bt = new byte[]{11,22,33};
//        BigInteger bigInteger = new BigInteger(bt);
//        System.out.println(bigInteger.intValue());

        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);
    }
}
