package sample;

import fita.learning.core.java.MyInput;

public class MyRunnable implements Runnable {
	private String name;
	public MyRunnable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name+i);
			//System.out.println("MyRunnable Input "+MyInput.in.nextLine());
		}
	}

}
