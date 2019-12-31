package hoo.hcute.chapter3;
import java.util.*;


public class BooleanTest{
   
  public static void main(String[] args){
    Random rand = new Random(47); // 47是个魔法数字
    int i = rand.nextInt(100); // 生成0-100的数字
    int j = rand.nextInt(100);
    System.out.println("i = " + i);
    System.out.println("j = " + j);
    System.out.println("i > j is " + (i > j));
    System.out.println("i < j is " + (i < j));
    System.out.println("i >= j is " + (i >= j));
    System.out.println("i <= j is " + (i <= j));
    System.out.println("i == j is " + (i == j));
    System.out.println("i != j is " + (i != j));
   // System.out.println("i && j is " + (i && j)); // 逻辑运算符操作的必须是Boolean类型
   // System.out.println("i || j is " + (i || j)); // 逻辑运算符操作的必须是Boolean类型
   // System.out.println("!i is " + !i); // 逻辑运算符操作的必须是Boolean类型
    System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
    System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
  }

}

