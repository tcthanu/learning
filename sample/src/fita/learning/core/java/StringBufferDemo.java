package fita.learning.core.java;

public class StringBufferDemo {

	public static void main(String[] args) {
		String s="Hello";
		s.concat(" World");
		StringBuffer sb = new StringBuffer("Hello"); 
		sb.append(" ");
		System.out.println(sb);
		System.out.println(s);
		StringBuilder sBuilder=new StringBuilder("Hello");
		sBuilder.append(" World");
		System.out.println(sb.indexOf("World"));
		System.out.println(sBuilder);
		
		
	}

}
