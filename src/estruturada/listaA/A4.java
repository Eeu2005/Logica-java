package lista1;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner eu = new Scanner(System.in);
		System.out.println("-----------------------------------Entrada De Dados ----------------------------------------------------------");
		System.out.println("digite a Altura");
		double  altura =  eu.nextDouble(); 
		System.out.println("digite o Raio");
		double raio  = eu.nextDouble();
		System.out.println("-----------------------------Resultado-------------------------------");
		double volume  = 3.14 *raio*raio*altura;
			System.out.println("o volume e de:  " + volume);
	}

}
