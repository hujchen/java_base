package hoo.hcute.chapter3;

public class TestEquals{
  
  public static void main(String[] args){
    Dog d1 = new Dog();
    d1.name = "spot";
    d1.says = "Ruff";

    Dog d2 = new Dog();
    d2.name = "scruff";
    d2.says = "Wurf";

    System.out.println(d1 == d2);
    System.out.println(d1.equals(d2));
    Dog d3 = d1;
    System.out.println(d3 == d1);
    System.out.println(d3.equals(d1));
    
  }
}

class Dog{
  String name;
  String says;
}
