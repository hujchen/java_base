package hoo.hcute.chapter3;
import java.util.*;


public class CastCoin{
  public String simulation(){
    Random rand = new Random();
    int face = rand.nextInt(2);
    String s;
    System.out.println(face);
    if (face == 0) {
	s = "正面";
    }else {
    	s = "反面";
    }
    return s;
  }

  public static void main(String[] args){
    for(int i=0; i< 100;i++){
       CastCoin coin = new CastCoin();
       String s = coin.simulation();
       System.out.println(s);
    }
  }
}
