package hoo.hcute.chapter3;

public class PlaceOperatorTest{
	
	public static void main(String[] args){
		int a =0x55; // 1010101 64 + 16 +4 + 1 = 85 = 5*16 + 5 = 55 
		int b =0x2A; // 101010  32+8+2 = 42 = 2*16 + 10 = 2A
		System.out.println("0x55 = " + Integer.toBinaryString(a));
		System.out.println("0x2A = " + Integer.toBinaryString(b));
		System.out.println("0x55 & 0x2A = " + Integer.toBinaryString(a&b));
		System.out.println("0x55 | 0x2A = " + Integer.toBinaryString(a|b));
		System.out.println("0x55 ^ 0x2A = " + Integer.toBinaryString(a^b));
		System.out.println("~0x55= "+Integer.toBinaryString(~a)+",0x2A = " + Integer.toBinaryString(~b));
	}

}
