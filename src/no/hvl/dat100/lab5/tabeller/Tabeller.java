package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	// a)
	public static void skrivUt(int[] tabell) {
		for (int j : tabell) {
			System.out.println(j);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tabellAsString = "";

		for (int i = 0; i < tabell.length; i++) {
			if (i != 0) {
				tabellAsString += ",";
			}

			tabellAsString += tabell[i];
		}

		tabellAsString = "[" + tabellAsString + "]";

		return tabellAsString;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int j : tabell) {
			sum += j;
		}

		return sum;

//		med for loop:
//
//		int sum = 0;
//
//		for (int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}
//
//		return sum;

//		med while loop:
//
//		int sum = 0;
//
//		int i = 0;
//		while (i < tabell.length) {
//			sum += tabell[i];
//			i++;
//		}
//
//		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i : tabell) {
			if (tall == i) return true;
		}

		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) return i;
		}

		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] resultTabell = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			resultTabell[tabell.length - 1 - i] = tabell[i];
		}

		return resultTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i - 1] >= tabell[i]) return false;
		}

		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] resultTabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			resultTabell[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {
			resultTabell[tabell1.length + i] = tabell2[i];
		}

		return resultTabell;
	}
}
