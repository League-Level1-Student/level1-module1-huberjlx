package _05_vault;

public class JamesBond {
	void findCode(Vault) {
		for (int i = 0; i <= 1000000; i++) {
			if 
		}
	}
}
class Vault {
	

	private int secretCode;
	private boolean openVault = false;
	
	Vault(int secretCode){
		this.secretCode = secretCode;
		System.out.println(secretCode);
	}
	
	public void tryCode(int guess) {
		if (guess == secretCode) {
			this.openVault = true;
			System.out.println("Vault: Vault is open.");
		} else {
			this.openVault = false;
		}
	}
}
}