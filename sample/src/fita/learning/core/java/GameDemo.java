package fita.learning.core.java;

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Option");
		System.out.println("1. Temple Run");
		System.out.println("2. Fruit Ninja");
		System.out.println("Other: Anonymous Game");
		int option = MyInput.in.nextInt();
		Game anonymousGame = new Game() {
			@Override
			public void play() {
				System.out.println("Default Game from anonymous Game");			
			}
			
		};
		Game g;
		switch (option) {
		case 1:
			g = new TempleRun();
			break;
		case 2:
			g = new FruitNinja();
			break;
		default:
			g = anonymousGame;
		}
		playGame(g);

	}

	public static void playGame(Game g) {
		g.play();
	}
}
