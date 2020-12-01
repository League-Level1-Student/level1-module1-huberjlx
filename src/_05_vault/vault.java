package _05_vault;

import java.util.Random;

public class vault {
	Random rand = new Random();
	int randNum = rand.nextInt(1000000);
	
	public void printCode() {
		System.out.println(secretCode);
	}
	
	int secretCode = randNum;
	private boolean openVault = false;
	
	public boolean tryCode(int guess) {
		if (guess == secretCode) {
			this.openVault = true;
			System.out.println("Vault: Vault is open.");
		} else {
			this.openVault = false;
			System.out.println("Vault: Incorrect guess.");
		}
		
		return openVault;
	}
}
