package br.com.magnasistema.modelo;

public class ConverterStringEmArray {

	public static void main(String[] args) {

		String name = "RAFAEL MACENA SOUZA";
		
		char[] myName = name.toCharArray();
		
		int contador = 0;

		for (int i = 0; i < myName.length; i++) {
			if (myName[i] == 'A') {
				contador++;
			}

		}

		System.out.println("Seu nome contém "+contador+" letras A.");

	}

}
