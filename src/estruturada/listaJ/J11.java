package listaJ;

import java.util.Scanner;

public class J11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String resp ="Sim";
				while(resp.equalsIgnoreCase("sim")) {
		System.out.println("digite o numero a ser fatorado");
		int num = sc.nextInt();
		int result  =1;
		for(int x = num;x>=1;x--) {
			result = x*result;
		}
		System.out.println("o fatorial é  "+ result);
				System.out.println("deseja outra consulta ");
				resp = sc.next();
				}
	}

}
