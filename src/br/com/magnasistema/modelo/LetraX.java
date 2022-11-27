package br.com.magnasistema.modelo;

public class LetraX {

	public static void main(String[] args) {

		int[][] z = new int[10][10];

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z.length; j++) {
				if ((i == 0 || i == 9) || (i == 1 && j == 8) || (i == 2 && j == 7 || i == 3 && j == 6)
						|| (i == 4 && j == 5) || (i == 5 && j == 4) || (i == 6 && j == 3) || (i == 7 && j == 2)
						|| (i == 8 && j == 1)) {
					System.out.print("X");

				} else if (1 > 0 && i < 9) {
					System.out.print("-");
				}
			}System.out.println();

			System.out.println();
		}
	}
}
