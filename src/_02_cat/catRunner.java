package _02_cat;

public class catRunner {
	public static void main(String[] args) {
		Cat kitten = new Cat("Mittens");
		kitten.meow();
		kitten.printName();
		for (int lives = 9; lives >= 0; lives--) {
			kitten.kill();
		}
	}
}
