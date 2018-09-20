package fita.learning.core.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayExample {
	public static void main(String[] args) {
		Integer x = 5; // Boxing 
		Double d =3.5;  
		Byte b= 5;
		int y= x;	// unboxing 	
		 Integer [] oddNumbers= {9,5,3,7,1};
		//String
		List<Integer> list = Arrays.asList(oddNumbers);
		Collections.sort(list);
		for(int i:list) {
			System.out.println(i);
		}
		
	}

}
