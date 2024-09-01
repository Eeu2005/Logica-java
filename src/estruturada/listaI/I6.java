package listaI;

import java.util.Scanner;

public class I6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int aprov=0,reprov=0;
		
		System.out.println("-------------MÉDIA  ALUNOS-----------------\n");
		
		for(int i=1;i<=20;i++) {
			System.out.println("Informe a média do " + i + "° aluno(a):");
			double media = sc.nextDouble();
			
			if(media >=6) {
				aprov++;
			}else {
				reprov++;
			}
		}
		
		System.out.println("\n------------------RESULTADO------------------\n");
		System.out.println("Aprovados: " + aprov);
		System.out.println("Reprovados: " + reprov);
		System.out.println("Total: " + (reprov+ aprov) );
	}

}
