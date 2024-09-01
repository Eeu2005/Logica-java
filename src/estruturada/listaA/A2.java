package lista1;

import java.util.Scanner;

public class A2 {
public static void  main ( String[]args ) {
	Scanner eu = new Scanner (System.in);
	
	
	System.out.println("--------------------------------Entrada de Dados---------------------");
	System.out.println(" ditgite o lado 1");
	int lado1 = eu.nextInt();
	
	System.out.println(" ditgite o lado 2");
	int lado2 = eu.nextInt();
	
	System.out.println("-----------------------resultado-------------------------------------------");
	System.out.println("o valor da Area e "+ lado1*lado2+"  Kilometros");
}
}
