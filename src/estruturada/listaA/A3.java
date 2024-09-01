package lista1;

import java.util.Scanner;

public class A3 {
public static void main(String[]Args) {
	Scanner eu = new Scanner(System.in);
	System.out.println("----------------------------Entrada De dados--------------");
	System.out.println("digite o valor em Centígrados ");
	int centigrados = eu.nextInt();
	System.out.println("----------------------------------------------Resultado");
	int fahereinth = (centigrados*9+160)/5;
	System.out.println("A temperatura  em Fahrenheit é "+fahereinth);	
	}
}

