package hoo.hcute.chapter3;

public class Literals{
  
  public static void main(String[] args){
     int i1 = 0x2f; // Hexadecimal lowercase
     System.out.println("i1 decimal is: " + (i1));
     System.out.println("i1 Hexadecimal is: " + Integer.toHexString(i1));
     System.out.println("i1 binary is: " + Integer.toBinaryString(i1));
     int i2 = 0x2F; // Hexadecimal uppercase 
     System.out.println("i2: " + Integer.toBinaryString(i2));
     int i3 = 0177; // Octal (leading zero)
     System.out.println("i3: " + Integer.toBinaryString(i3));
     char c = 0xffff; // max char hex value
     System.out.println("max char binary is: "+ Integer.toBinaryString(c));
     byte b = 0x7f; // max byte hex value
     System.out.println("max byte binary is: "+ Integer.toBinaryString(b));
     short s = 0x7fff; //max short hex value
     System.out.println("max short binary is: "+ Integer.toBinaryString(s));
  

     long l1 = 0xffff;
     System.out.println("l1 binary is: "+ Long.toBinaryString(l1));
     long l2 = 077777;  
     System.out.println("l2 binary is: "+ Long.toBinaryString(l2));
  }

}
