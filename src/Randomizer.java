

import java.util.Random;

public class Randomizer {
	
	public static void Randomize(Object[] a) {
		Random randomizer = new Random();
		for (int i = 0; i < a.length; i++) {
			int r = randomizer.nextInt(i+1); 
			exch(a, i, r);
		}
	}
	
	private static void exch(Object[] a, int i, int r) {
		Object temp = a[i];
		a[i]= a[r];
		a[r]=temp ;
	}

}
