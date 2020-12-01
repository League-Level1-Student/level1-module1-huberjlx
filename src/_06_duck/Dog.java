package _06_duck;

public class Dog {
	
	private String favoriteFood;
	private int numberOfFriends;
	
	Dog(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	public void bark() {
		System.out.println("Bark!");
	}
	public void pant() {
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pant Pant Pant!");
	}
}
