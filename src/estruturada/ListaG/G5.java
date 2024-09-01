package ListaG;

import java.util.Scanner;

public class G5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("-----------ESCOLINHA  DE FUTEBOL-------------\n");
		System.out.println("Informe o nome do aluno(a):");
		String nome = sc.nextLine();
		System.out.println("Informe a idade:");
		int idade = sc.nextInt();
		
		String categoria = "";
		
		if(idade >=6 && idade <=8 ) {
			categoria = "Dente de Leite";
		}else if(idade>=9 && idade <=11) {
			categoria = "Pré-Mirim";
		}
		else if(idade==12 || idade ==13) {
			categoria = "Mirim";
		}
		else if(idade==14 || idade ==15) {
			categoria = "Infantil";
		}
		else if(idade==16 || idade ==17) {
			categoria = "Juvenil";
		}
		else if(idade>=18 &&  idade <=20) {
			categoria = "Juniores";
		}else {
			categoria = "Sem categoria!";
		}
		
		
		System.out.println("\n----------------RESULTADO-----------------------\n");
		System.out.println("Nome: " + nome + "\nCategoria: " + categoria);
	
	}

}
