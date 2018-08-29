package fita.learning.core.java;

public class AstaPoo {
	
	
 public void printAstaPoo(int noOfRows) {
	 for(int i=0;i<noOfRows;i++) {
			printStars(noOfRows, i);
		}
		for(int i=noOfRows;i>=0;i--) {
			printStars(noOfRows, i);
		}
 }
 	
private static void printStars(int noOfRows, int i) {
	for(int x=(noOfRows*2)+1;x>i;x--) 
		System.out.print("   ");
	for(int y=0;y<i*2+1;y++) {
		System.out.print(" * ");
	}
	System.out.println();
}
}
