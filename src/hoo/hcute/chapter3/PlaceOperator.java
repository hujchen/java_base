package hoo.hcute.chapter3;

public class PlaceOperator{
	public static void main(String[] args){
		int a = 0b1110;
		int c = 0b1010;
		int d = a & c;
		int e = a | c;
		int f = a ^ c;
		int g = ~a;
		System.out.println("1110 & 1010 = "+ Integer.toBinaryString(d));
		System.out.println("1110 | 1010 = "+ Integer.toBinaryString(e));
		System.out.println("1110 ^ 1010 = "+ Integer.toBinaryString(f));
		System.out.println("~1110 = " + Integer.toBinaryString(g));
		System.out.println(false & true);
	}
}
