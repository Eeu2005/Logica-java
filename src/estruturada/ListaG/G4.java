package ListaG;

import java.util.Scanner;

public class G4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("------------------REAJUSTE SALARIAL---------------------\n");
	
	System.out.println("Informe o nome do funcionário:");
	String nome = sc.next();
	System.out.println("informe o salário atual do(a) " + nome);
	double salario = sc.nextDouble();
	System.out.println("Informe o código da função: ");
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
		System.err.println("Código inválido.");;
		perc = 0;
		
	}
	
	double salarioNovo = salario + (salario/100)* perc;

	
	
	System.out.println("Funcionário: " + nome);
	System.out.println("Cargo: " + cargo);
	System.out.println("Salário atual: R$" + salario );
	
	switch  (perc) {
	case 0:
		System.out.println("Salário novo:");
		break;
	default:
		System.out.println("Salário novo: R$"  + salarioNovo );
		
	}
	
	
	


	}

}
