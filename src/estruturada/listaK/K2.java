package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String resp ="";
		int sim=0,nao=0,nulo=0;
		int fem=0,masc=0,outro=0;
		int femSim=0,mascNao=0;
		
		
		
		do {
			

			int sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o seu sexo:\n1-Masculino\n2-Feminino\nOUTRO NÙMERO-Não desejo informar.","Pesquisa", JOptionPane.QUESTION_MESSAGE));
			int opiniao = Integer.parseInt(JOptionPane.showInputDialog(null,"Você gostou do novo produto:\n1-SIM\n2-NÃO", "Pesquisa",JOptionPane.INFORMATION_MESSAGE));
			
			switch(opiniao) {
			
			case 1:
				sim++;
				
				if(sexo ==1) {
					masc++;
				}else if(sexo==2) {
					fem++;
					femSim++;
				}else {
					outro++;
				}
				
				break;
			case 2:
				nao++;
				
				if(sexo ==1) {
					masc++;
					mascNao++;
				}else if(sexo==2) {
					fem++;
					
				}else {
					outro++;
				}
				
				break;
				
			default:
				nulo++;
			
			
			}
			
			
			
			
			resp = JOptionPane.showInputDialog(null, "Deseja continuar?\nSIM ou NÃO", "Pesquisa",JOptionPane.INFORMATION_MESSAGE);
		}while(resp.equalsIgnoreCase("sim"));
		
		
		JOptionPane.showConfirmDialog(null, "Gostaram do produto: " + sim + " pessoas.\nNão gostaram do produto: " + nao + " pessoas.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				if(fem != 0) {
			double percFemSim = (femSim*100)/fem;
			JOptionPane.showConfirmDialog(null, "Pessoas do sexo Feminino que gostaram:"+  percFemSim+ "%.","Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		if(masc!=0) {
			double percMascNao = (mascNao*100)/masc;
			JOptionPane.showConfirmDialog(null, "Pessoas do sexo Masculino que não gostaram:" + percMascNao+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		
		

	}

}
