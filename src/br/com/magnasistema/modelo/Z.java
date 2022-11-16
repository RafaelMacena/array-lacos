package br.com.magnasistema.modelo;

public class Z {

	public static void main(String[] args) {
		
		
		

		int[]dimensao = new int[15];

		imprimirNaHorizontal(dimensao);
		
		System.out.println();
		
		for (int i = 15; i >= 0; i--) {
			imprimirNaDiagonal(i);

		}
		imprimirNaHorizontal(dimensao);

	}

	private static void imprimirNaHorizontal(int[] dimensao) {
		for (int i = 0; i < dimensao.length; i++) {
			System.out.print("*");

		}
	}

	private static void imprimirNaDiagonal(int i) {
		if (i == 14) {
			System.out.println("          " + "***");

		}
		if (i == 13) {
			System.out.println("         " + "***");
		}
		if (i == 12) {
			System.out.println("        " + "***");
		}
		if (i == 11) {
			System.out.println("       " + "***");
		}
		if (i == 10) {
			System.out.println("      " + "***");
		}
		if (i == 9) {
			System.out.println("     " + "***");
		}
		if (i == 8) {
			System.out.println("    " + "***");
		}
		if (i == 7) {
			System.out.println("   " + "***");
		}
		if (i == 6) {
			System.out.println("  " + "***");
		}
		if (i == 5) {
			System.out.println(" " + "***");
		}
	}

}
