package ListaG;

import java.util.Scanner;

public class G1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Informe o c�digo de erro:");
	int erro = sc.nextInt();
	
	switch (erro) {
		case 1:
			System.err.println("Identificador inv�lido.");
		break;
	
		case 2:
			System.err.println("Esperando n�mero inteiro. ");

		break;
		case 3:
			System.err.println("Tipo de dado indefinido. ");
		break;
		case 4:
			System.err.println("Par�6metro incorreto.");
		break;
		case 5:
			System.err.println("Mem�ria insuficiente.");
		break;
		default:
			System.err.println("Erro desconhecido! ");
	}

	}

}
