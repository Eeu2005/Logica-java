package calculadora;

import java.util.Scanner;

public class TestaCalculadora {

	public static void main(String[] args) {
		Calculadora myCalc = new Calculadora();
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros você deseja multplicar");
		int vetor[] =  new int[sc.nextInt()];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("digite o "+(i+1)+" °numero");
			vetor[i] = sc.nextInt();
		}
		System.out.println("digite o simbolo da operação desejada");
		String op = sc.next();
		
		//System.out.println(myCalc.somar(vetor));
		System.out.println(myCalc.calcular(vetor, op));
		sc.close();
		
	}

}
