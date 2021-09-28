package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] ints : matrise) {
			for (int i : ints) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String resultat = "";

		for (int[] ints : matrise) {
			for (int i : ints) {
				resultat += i;
				resultat += " ";
			}

			resultat += "\n";
		}

		return resultat;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] resultat = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				resultat[i][j] = matrise[i][j] * tall;
			}
		}

		return resultat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length == 0 && b.length == 0) return true;
		if (a.length != b.length) return false;
		if (a[0].length != b[0].length) return false;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) return false;
			}
		}

		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] resultat = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				resultat[j][i] = matrise[i][j];
			}
		}

		return resultat;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (a.length != b[0].length) return null;

		int[][] resultat = new int[a.length][b[0].length];

		for (int row = 0; row < resultat.length; row++) {
			for (int col = 0; col < resultat[row].length; col++) {
				int cell = 0;

				for (int i = 0; i < b.length; i++) {
					cell += a[row][i] * b[i][col];
				}

				resultat[row][col] = cell;
			}
		}

		return resultat;
	}
}
