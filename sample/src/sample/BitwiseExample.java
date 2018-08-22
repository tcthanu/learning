package sample;

public class BitwiseExample {
	public static void main(String[] args) {
		int x=0b1111;
		int y=0b1010;
		System.out.println(x);
		System.out.println(y);
		//x&=y; 
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		System.out.println(x>>1);
		System.out.println(x<<1);
		System.out.println(x<<2);
		boolean a=false;
		boolean b=true;
		System.out.println( x>10 && (++y)<20);
		System.out.println(y);
		
		
		System.out.println( x>10 | y<20);
		System.out.println( a ^ b);
		
	}
}
