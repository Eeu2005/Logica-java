package lista1;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {
		Scanner fodase = new Scanner(System.in);
		
		System.out.println("qual o preço do produto?");
		double preco = fodase.nextDouble();
		double desconto= (preco/100)*10;
		double preco_vista = preco-desconto;
		
		System.out.println("o preço foi de: "+preco+" para:  "+ preco_vista+"  com desconto de " + desconto);
		
	
		
	
	}
	}