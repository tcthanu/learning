package fita.learning.core.java;

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Option");
		System.out.println("1. Temple Run");
		System.out.println("2. Fruit Ninja");
		System.out.println("Other: Temple Run");
		int option = MyInput.in.nextInt();
		Game g;
		switch (option) {
		case 1:
			g = new TempleRun();
			break;
		case 2:
			g = new FruitNinja();
			break;
		default:
			g = new TempleRun();
		}
		playGame(g);

	}

	public static void playGame(Game g) {
		g.play();
	}
}
