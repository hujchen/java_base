package hoo.hcute.chapter2;

public class Storage{

  int storage(String s){
    return s.length() * 2;
  }
}

class TestStorage{
  public static void main(String[] args){
    Storage  s = new Storage();
    String sp = "hello java";
    int x = s.storage(sp);
    System.out.println(sp);
  }
}
