package hoo.hcute.chapter3;

public class FloatOne{

  float f;

}

class Assignment {
   
  public static void main(String[] args) {
    FloatOne f1 = new FloatOne();
    FloatOne f2 = new FloatOne();
    f1.f = 12.00f;
    f2.f = 24.00f;

    System.out.println("f1.f = " + f1.f + ", f2.f = " + f2.f);
    f1 = f2;

    System.out.println("f1.f = " + f1.f + ", f2.f = " + f2.f);

    f2.f = 36.00f;

    System.out.println("f1.f = " + f1.f + ", f2.f = " + f2.f);


    Assignment.f(f2);
    System.out.println("f1.f = " + f1.f + ", f2.f = " + f2.f);
  }

  static void f(FloatOne f){
    f.f = 48.00f;
  }

}

