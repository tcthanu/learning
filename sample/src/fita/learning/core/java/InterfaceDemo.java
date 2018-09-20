package fita.learning.core.java;

public class InterfaceDemo {
	public static void main(String[] args) {
		TestInterface test2= new TestInterface() {			
			@Override
			public void test() {
				System.out.println("Test Annoymous");				
			}
		};
		
		test2.test();
	}
}
