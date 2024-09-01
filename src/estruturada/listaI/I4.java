package listaI;

import java.util.Scanner;

public class I4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------TABUADA-------------------\n'");
	
		System.out.println("Informe um número:");
		int num = sc.nextInt();
		
		System.out.println("\nTabuada do " + num + ":\n");
		
		for(int i = 0;i<=10;i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
	
	
	
	
	
	
	
	}

}
