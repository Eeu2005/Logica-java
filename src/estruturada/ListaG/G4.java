package ListaG;

import java.util.Scanner;

public class G4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("------------------REAJUSTE SALARIAL---------------------\n");
	
	System.out.println("Informe o nome do funcion�rio:");
	String nome = sc.next();
	System.out.println("informe o sal�rio atual do(a) " + nome);
	double salario = sc.nextDouble();
	System.out.println("Informe o c�digo da fun��o: ");
	int cod = sc.nextInt();
	
	int perc = 0;
	String cargo = "";
	
	System.out.println("---------------------RESULTADO----------------------\n");
	
	switch (cod){
	case 1:
		perc = 5;
		cargo = "Operador";
		break;
	case 2: 
		perc = 10;
		cargo = "Programador";
		break;
	case 3:
		perc = 15;
		cargo = "Analista";
		break;
	case 4:
		perc = 25;
		cargo = "Gerente";
		break;
	default:
		System.err.println("C�digo inv�lido.");;
		perc = 0;
		
	}
	
	double salarioNovo = salario + (salario/100)* perc;

	
	
	System.out.println("Funcion�rio: " + nome);
	System.out.println("Cargo: " + cargo);
	System.out.println("Sal�rio atual: R$" + salario );
	
	switch  (perc) {
	case 0:
		System.out.println("Sal�rio novo:");
		break;
	default:
		System.out.println("Sal�rio novo: R$"  + salarioNovo );
		
	}
	
	
	


	}

}
