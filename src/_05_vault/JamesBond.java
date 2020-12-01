package _05_vault;

import java.util.Random;

class JamesBond {
	public int findCode(vault v) {
		for (int i = 0; i <= 1000000; i++) {
			if (v.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
}
