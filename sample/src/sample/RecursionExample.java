package sample;

public class RecursionExample {
	public static void main(String[] args) {
		System.out.println("Factorial Vlue = "+factorial(10));
		System.out.println(10*9*8*7*6*5*4*3*2*1);
	}

	public static double factorial(double num) {
		System.out.println(num);
		if(num==1) {
			return 1;
		}
		return num*factorial(num-1);
	}
}