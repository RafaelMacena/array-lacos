package br.com.magnasistema.modelo;

public class QtdDeCadaLetraDoSeuNome {

	public static void main(String[] args) {

		String nome = "RAFAEL MACENA SOUZA";

		char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		char[] myName = nome.toCharArray();

		int[][] ordenacao = new int[alfabeto.length][2];

		for (int i = 0; i < alfabeto.length; i++) {
			ordenacao[i][0] = alfabeto[i];
			for (int j = 0; j < myName.length; j++) {
				if (alfabeto[i] == myName[j]) {
					ordenacao[i][1] += 1;

				}
			}

		}

		for (int j = 0; j < alfabeto.length; j++)

			System.out.println(
					" Letra " + (char) ordenacao[j][0] + " ocorre " + ordenacao[j][1] + " vezes em seu nome.");

		{

		}
	}

}
