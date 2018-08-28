package fita.learning.core.java;

public class FormattedPrinting {
	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=20;i++)
		System.out.printf("%2d X %d  = %3d \n",i,num, i*num);
	}
}
