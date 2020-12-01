package _06_duck;

public class duckRunner {

	public static void main(String[] args) {
		Duck daffyDuck = new Duck("Donuts", 2);
		Dog Bode = new Dog("Meat", 4);
		Bode.bark();
		Bode.pant();
		daffyDuck.quack();
		daffyDuck.waddle();
	}
}
