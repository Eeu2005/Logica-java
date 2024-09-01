package ListaG;

import java.util.Scanner;

public class G2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o codigo do seu departamento");
		int cod =  sc.nextInt();
		
		switch(cod) {
		case 10: 
			System.out.println("Expedição");
			break;
		case 20:
			System.out.println("Recursos Humanos");
			break;
		case 30 :
			System.out.println("Logística");
			break;
		case 40:
			System.out.println("Contabilidade");
			break;
		case 50:
			System.out.println("Departamento");
			break;
		case 60 :
			System.out.println("Informática");
			break;
			default: System.out.println("Não consta no sistema");
			
		}

	}

}
