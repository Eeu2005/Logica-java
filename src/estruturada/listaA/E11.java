
package lista1;

import java.util.Scanner;

	public class E11 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			 System.out.println("-----------------------------CALC�LO SAL�RIO-----------------------------------");
			
			int resp = 1;
			while(resp == 1) {
				
				
					System.out.println("Qual o nome do funcionario");
					String nome = leia.next(); 
		
					System.out.println("escreva o salario Atual: ");
					double salarioFixo =  leia.nextDouble();
					
					
					System.out.println("Valor da comiss�o  por cada carro:" );
					double	 comissaoFixa = leia.nextDouble();
					
					System.out.println("Quantidade vendida de carros");
					int  qtdaCarros = leia.nextInt();
				
					System.out.println("Valor total de  vendas");
					int vendas = leia.nextInt();
					//processamento
					
					double comissaoRecebida = vendas * 0.05;
				    double qtdaCarrosTotal = comissaoFixa * qtdaCarros;
				    double totalSalario = salarioFixo + qtdaCarrosTotal + comissaoRecebida;
				    
				    // envio dados
				    System.out.println("\n----------------------------RESULTADO-----------------------------------");
				    System.out.println("Funcion�rio: " + nome + "\nSal�rio mensal: R$ " + totalSalario);
				
		
					System.out.println("\nNova consulta?\n1-SIM ou Outro n�mero-N�O ");
					resp = leia.nextInt();
				
			}
			
			
			System.out.println("FIM.......");
			
			
				
				
				
	}

}
