package br.com.magnasistema.modelo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args)  {
      
      Scanner in = new Scanner(System.in);
      
//      int A = in.nextInt();
//      int B = in.nextInt();
//      int C = in.nextInt();
//    
//   
//      int maiorAB =(B + A + (B-A))/2;
//      int maiorABC = (C + maiorAB  + (C - maiorAB))/2;
//     
//      
//      System.out.println(maiorABC + " eh o maior");
//      
//      
    
      
//      int x = in.nextInt();
//      double y = in.nextDouble();
//      
//      double consumo = x / y;
//      
//      System.out.printf("%.3f km/l\n", consumo);

      double x1 = in.nextDouble();
      double x2 = in.nextDouble();
      double y1 = in.nextDouble();
      double y2 = in.nextDouble(); 
      
      double distancia = Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2));
      System.out.printf("%.4f\n",distancia);
    }

}
