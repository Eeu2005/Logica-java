package listaI;

import java.util.Scanner;

public class I5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int x = 1;x<=10;x++) {
		System.out.println("digite a nota 1 do "+x+"° aluno");
		int nota1 = sc.nextInt();
		System.out.println("digite a nota 2 do "+x+"° aluno");
		int nota2 = sc.nextInt();
		System.out.println("digite a nota 3 do "+x+"° aluno");
		int nota3 = sc.nextInt();
		System.out.println("digite a nota 4 do "+x+"° aluno");
		int nota4 = sc.nextInt();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("a media do "+x+"° aluno é "+ media );
		}
		
	}

}
