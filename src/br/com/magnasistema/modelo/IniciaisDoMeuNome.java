package br.com.magnasistema.modelo;

public class IniciaisDoMeuNome {

	public static void main(String[] args) {

		gerarR();
		pularLinhas();
		gerarM();
		pularLinhas();
		gerarS();
		

	}

	private static void pularLinhas() {
		System.out.println();
		System.out.println();
	}

	private static void gerarS() {
		System.out.println("-".repeat(14));
		for (int i = 0; i < 6; i++) {
			System.out.println("-");
		}
		System.out.println("-".repeat(14));
		for (int i = 0; i < 6; i++) {
			System.out.println("             -");
		}
		System.out.println("-".repeat(14));
	}

	private static void gerarM() {
		System.out.println("--           --");
		for (int i = 0; i < 20; i++) {
			if (i==2) {
				System.out.print("-  -       -" +"  -\n");
			}
			if (i == 3) {
				System.out.println("-   -     -   -");

			}
			if (i == 4) {
				System.out.println("-    -   -    -");
			}
			if (i == 5) {
				System.out.println("-     - -     -");
			}
			if (i == 6) {
				System.out.println("-      -      -");
			}
			if (i == 7) {
				System.out.println("-             -");
			}
			if (i == 8) {
				System.out.println("-             -");
			}
			if (i == 9) {
				System.out.println("-             -");
			}
			
			
		}
		
		
	}

	private static void gerarR() {
		int[] dimensao = new int[12];

		imprimirNaHorizontal(dimensao);

		for (int i = 15; i >= 0; i--) {
			imprimirNaDiagonal(i);

		}
	}

	private static void imprimirNaHorizontal(int[] dimensao) {
		for (int i = 0; i < dimensao.length; i++) {
			System.out.print("-");

		}
	}

	

	private static void imprimirNaDiagonal(int i) {
		if (i==15) {
			System.out.print("           " + "\n");
		}
		if (i == 14) {
			System.out.println("-           " + "-");

		}
		if (i == 13) {
			System.out.println("-          " + "-");
		}
		if (i == 12) {
			System.out.println("-         " + "-");
		}
		if (i == 11) {
			System.out.println("-       " + "-");
		}
		if (i == 10) {
			System.out.println("-    " + "-");
		}
		if (i == 9) {
			System.out.println("-      " + "-");
		}
		if (i == 8) {
			System.out.println("-        " + "-");
		}
		if (i == 7) {
			System.out.println("-         " + "-");
		}
		if (i == 6) {
			System.out.println("-          " + "-");
		}
		if (i == 5) {
			System.out.println("-           " + "-");
		}
	}

}
