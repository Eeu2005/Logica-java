package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrix=0,senhor=0,nulo=0;
		
		String resp = "";
		
		do {
			
			
			int voto = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a seu voto:\n1-Matrix\n2-Senhor dos Anéis","PESQUISA",JOptionPane.INFORMATION_MESSAGE));;
			
			switch(voto) {
			
			case 1:
				matrix++;
				break;
			case 2:
				senhor++;
				break;
			default:
				nulo++;
			
			}
			

			
			resp  = JOptionPane.showInputDialog(null,"Deseja continuar?\nSIM ou NÃO","PESQUISA",JOptionPane.INFORMATION_MESSAGE);
		}while(resp.equalsIgnoreCase("sim"));
		
		if(matrix>senhor) {
			JOptionPane.showMessageDialog(null,"\nMATRIX CAMPEÃO!!!\n1°Matrix--> " + matrix + " votos.\n2°Senhor dos Anéis--> " + senhor + " votos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}else if(senhor>matrix) {
			JOptionPane.showMessageDialog(null,"\nSENHOR DOS ANÉIS CAMPEÃO!!!\n1°Senhor dos Anéis--> " + senhor + " votos.\n2°Matrix--> " + matrix + " votos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}else{
			
			JOptionPane.showMessageDialog(null,"\nEMPATE\n1°Senhor dos Anéis--> " + senhor + " votos.\n1°Matrix--> " + matrix + " votos.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}

}
