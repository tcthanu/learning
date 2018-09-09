package fita.learning.core.java;

public class ParentChildDemo {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		System.out.println("Behaviours of Child 1");
		c1.behaviour1();
		c1.behaviour2();
		c1.behaviour3();
		System.out.println("Behaviours of Child 2");
		c2.behaviour1();
		c2.behaviour2();
		c2.behaviour3();
	}
}
