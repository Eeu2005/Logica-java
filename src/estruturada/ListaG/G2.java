package ListaG;

import java.util.Scanner;

public class G2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o codigo do seu departamento");
		int cod =  sc.nextInt();
		
		switch(cod) {
		case 10: 
			System.out.println("Expedi��o");
			break;
		case 20:
			System.out.println("Recursos Humanos");
			break;
		case 30 :
			System.out.println("Log�stica");
			break;
		case 40:
			System.out.println("Contabilidade");
			break;
		case 50:
			System.out.println("Departamento");
			break;
		case 60 :
			System.out.println("Inform�tica");
			break;
			default: System.out.println("N�o consta no sistema");
			
		}

	}

}
