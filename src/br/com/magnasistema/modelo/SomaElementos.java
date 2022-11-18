package br.com.magnasistema.modelo;

import java.util.Arrays;
import java.util.List;

public class SomaElementos {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		int total = 0;
		for (int i = 0; i < numeros.size(); i++) {
			total += numeros.get(i);
		}
		System.out.println(total);

	}

}
