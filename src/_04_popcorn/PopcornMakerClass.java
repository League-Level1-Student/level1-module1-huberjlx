package _04_popcorn;

public class PopcornMakerClass {

	public static void main(String[] args) {
		Popcorn p = new Popcorn("Butter");
		Microwave m = new Microwave();
		
		m.putInMicrowave(p);
		m.setTime(2);
		m.startMicrowave();
	}

}
