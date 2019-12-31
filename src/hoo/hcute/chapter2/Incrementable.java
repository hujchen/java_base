package hoo.hcute.chapter2;

public class Incrementable {

   static void increment(){
     StaticTest.i++;
   }
   public static void main(String[] args){
     StaticTest st1 = new StaticTest();
     StaticTest st2 = new StaticTest();
     StaticTest.i++;
     System.out.println(st1.i);
     System.out.println(st2.i);

     Incrementable.increment();
     System.out.println(st1.i);
     System.out.println(st2.i);

     System.out.println(st1.i++);
     System.out.println(st2.i++);
   }

}

class StaticTest{
  static int i = 47;
}
