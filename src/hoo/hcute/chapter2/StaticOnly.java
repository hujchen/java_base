package hoo.hcute.chapter2;

public class StaticOnly{
  static int x = 22;
}

class TestStaticOnly{
  public static void main(String[] args){
    StaticOnly only1 = new StaticOnly();
    StaticOnly only2 = new StaticOnly();
    StaticOnly only3 = new StaticOnly();
    System.out.println(only1.x);
    System.out.println(only2.x);
    System.out.println(only3.x);
  }

}
