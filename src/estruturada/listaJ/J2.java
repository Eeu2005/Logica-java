package listaJ;

import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("digite um numero para o loop");
		int contador = sc.nextInt();
		int x = 0;
		while(x<=contador) {
			if(x%2==0) {
				System.out.println(x+" e par");
			}else {
				System.out.println(x +" e inpar");
			}
			x++;
		}
		
		
		
	}
}
