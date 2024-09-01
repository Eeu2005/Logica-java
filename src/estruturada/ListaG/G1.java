package ListaG;

import java.util.Scanner;

public class G1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Informe o código de erro:");
	int erro = sc.nextInt();
	
	switch (erro) {
		case 1:
			System.err.println("Identificador inválido.");
		break;
	
		case 2:
			System.err.println("Esperando número inteiro. ");

		break;
		case 3:
			System.err.println("Tipo de dado indefinido. ");
		break;
		case 4:
			System.err.println("Parâ6metro incorreto.");
		break;
		case 5:
			System.err.println("Memória insuficiente.");
		break;
		default:
			System.err.println("Erro desconhecido! ");
	}

	}

}
