package sample;

public class Puzzle {

	public static void main(String[] args) {
		for(int abcd=1000;abcd<5000;abcd++) {
		int a=abcd / 1000;
		int d=abcd % 10;
		int ab=abcd/100;
		int cd=abcd%100;
		int b= ab%10;
		int c= cd/10;
		if( d== (2*a) && cd == (2*ab) && b==c ) {
			System.out.println(abcd);
		}
//		System.out.println("first digit:"+a);
//		System.out.println("Last digit:"+d);
//		System.out.println("first two digits:"+ab);
//		System.out.println("last two digits"+cd);
		}
		

	}

}
