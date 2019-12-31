package hoo.hcute.chapter3;

public class ShortCircuit{

  static boolean test1(int val){
    System.out.println("val = " + val);
    System.out.println("val > 1 " + (val > 1));
    return val > 1;
  }

  static boolean test2(int val){
    System.out.println("val = " + val);
    System.out.println("val > 2 " + (val >2));
    return val > 2;
  }

  static boolean test3(int val){
    System.out.println("val = " + val);
    System.out.println("val > 3 " + (val > 3));
    return val > 3;
  }

  public static void main(String[] args){
    boolean b = test1(2)&&test2(2)&&test3(4);
    System.out.println("expression is "+ b);
  }

}
