package sample;

public class ThreadGroupDemo {
	public static void main(String[] args) {
	  ThreadGroup tg= new ThreadGroup("group1");
	  Thread t1=new Thread(tg,new MyThread());
	  Thread t2=new Thread(tg,new MyRunnable("t2:"));
	  Thread t3=new Thread(tg,new MyRunnable("t3:"));
	  System.out.println(tg);
	  t1.start();
	  t2.start();
	  t3.start();
	  
	}
}
