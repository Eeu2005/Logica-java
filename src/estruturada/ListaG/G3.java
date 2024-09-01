package ListaG;

import java.util.Scanner;

public class G3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o nome do funcionario");
		String nome = sc.next();
		System.out.println("digite o  salario de "+ nome);
	double salario = sc.nextDouble();
		System.out.println("Digite o Codigo do ajuste Salarial do  sr(a)"+ nome);
		int cod = sc.nextInt();
		
		int ajuste = 1;
		switch(cod) {
		case 5:
		ajuste = 5;
		break;
		case 15:
			ajuste = 10;
			break;
		case 20:
			ajuste =15;
		break;
		case 25:
			ajuste = 20;
			break;
		case 30:
			
			ajuste = 25;
			break;
		case 35:
			ajuste = 30;
			break;
			default: 
				System.out.println("Não existe esse codigo");
				break;
		}
		double novoSalario = salario +(salario*ajuste)/100;
		
		System.out.println("O salario de "+nome +" foi de "+ salario +" para "+novoSalario);
		
		
		
	}

}
