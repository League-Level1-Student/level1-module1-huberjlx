package _06_duck;

public class Duck {
	
	private String favoriteFood;
	private int numberOfFriends;
	
	//Constructor 
	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	public void quack() {
		System.out.println("Quack!");
	}
	public void waddle() {
		System.out.println("Waddle Waddle!");
	}
	
}
