package listaI;

import java.util.Scanner;

public class I7 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);	
		System.out.println("------- Media idade da Sala-----");
		
		System.out.println("digite a quantidade de alunos");
		int qtdeAlunos = sc.nextInt();
		int somaIdade = 0;
		for(int x= 1;x<=qtdeAlunos;x++) {
		
			System.out.println("digite a idade  do "+x+"°");
			somaIdade += sc.nextInt();
		}
		double media = somaIdade/qtdeAlunos;
		
		System.out.println("a media dos alunos é  "+ media);
		
	}

}
