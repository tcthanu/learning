package fita.learning.core.java;

public class ExceptionSample {
	public static void main(String[] args) {
		try {
			System.out.println("Please Enter 2 Numbers");
			int x=MyInput.in.nextInt();
			int y=MyInput.in.nextInt();
			int z=x/y;
		System.out.println("result:"+z);
		}catch(ArithmeticException excetion) {
			System.out.println("Error :" + excetion.getMessage());
			System.out.println("Denominator or 2nd Number should not be zero");
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("Something went wrong..");
		}
		
		finally {
			System.out.println("Closing Acitivity..");
		}
	}

}
