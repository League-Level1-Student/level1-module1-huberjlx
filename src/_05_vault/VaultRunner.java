package _05_vault;

public class VaultRunner {

	public static void main(String[] args) {
		vault vault = new vault();
		JamesBond bond = new JamesBond();
		int i = bond.findCode(vault);
		System.out.println(i);

	}

}
