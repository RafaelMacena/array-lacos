package br.com.magnasistema.modelo;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 10; i++) {
			sb.append("Z");
		}
		
		
		for (int i = 10; i >= 0; i--) {
			if(i == 9) {
				sb.append("\n");
				sb.append("        "+"Z" + "\n");
			}
			if(i == 8) {
				sb.append("       "+"Z" + "\n");
			}
			if(i == 7) {
				sb.append("      "+"Z" + "\n");
			}
			if(i == 6) {
				sb.append("    "+"Z" + "\n");
			}
			if(i == 5) {
				sb.append("   "+"Z" + "\n");
			}
			if(i == 4) {
				sb.append("  "+"Z" + "\n");
			}
			if(i == 3) {
				sb.append(" "+"Z" + "\n");
			}
			if(i == 2) {
				sb.append("Z" + "\n");
			}
		}
		
		for (int i = 0; i < 10; i++) {
			sb.append("Z");
		}
		
		System.out.println(sb);
	}

}
