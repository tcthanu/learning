package sample;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable("t1"));
		System.out.println("T 1 State" + t1.getState());
		System.out.println("T 2 State" + t2.getState());
		t1.start();
		System.out.println("T 1 State" + t1.getState());
		System.out.println("T 2 State" + t2.getState());
		t2.start();
		System.out.println("T 1 State" + t1.getState());
		System.out.println("T 2 State" + t2.getState());
		t1.start();
		
	}
}
