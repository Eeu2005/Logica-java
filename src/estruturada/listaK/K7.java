package listaK;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Z7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int teixeira=0,falcao=0,nulo=0,total=0;
		
		String resp = "";
		
		do {
			
			
			int voto = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a seu voto:\n1-Ricardo Teixeira\n2-Paulo Falcao","Pesquisa", JOptionPane.INFORMATION_MESSAGE));
			
			switch(voto) {
			
			case 1:
				teixeira++;
				break;
			case 2:
				falcao++;
				break;
			default:
				nulo++;
			
			}
			
			
			total++;
			resp  = JOptionPane.showInputDialog(null,"Deseja continuar?\nSIM ou NÃO","PESQUISA",JOptionPane.INFORMATION_MESSAGE);
			
			
		}while(resp.equalsIgnoreCase("sim"));
		
		
		
		if(teixeira>falcao) {
			double percTexeira = (teixeira*100)/total;
			JOptionPane.showMessageDialog(null,"1°Ricardo Teixeira: " + teixeira + " votos-> " + percTexeira + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);

			if(falcao!=0) {
				double percFalcao = (falcao*100)/total;
				JOptionPane.showMessageDialog(null,"2°Paulo Falcao: " + falcao + " votos-> " + percFalcao + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"2°Paulo Falcao: 0 votos-> 0%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}else if(falcao>teixeira) {
			double percFalcao = (falcao*100)/total;
			JOptionPane.showMessageDialog(null,"1°Paulo Falcao: " + falcao + " votos-> " + percFalcao + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			if(falcao!=0) {
				double percTexeira = (teixeira*100)/total;
				JOptionPane.showMessageDialog(null,"2°Ricardo Teixeira: " + teixeira + " votos-> " + percTexeira + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,"2°Ricardo Teixeira: 0 votos-> 0%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(falcao==teixeira) {

			int voto = Integer.parseInt(JOptionPane.showInputDialog(null,"EMPATE!!!\nInforme a seu voto:\n1-Ricardo Teixeira\n2-Paulo Falcao","Pesquisa", JOptionPane.INFORMATION_MESSAGE));
			
			switch(voto) {
			
			case 1:
				teixeira++;
				break;
			case 2:
				falcao++;
				break;
			default:
				nulo++;
			
			}	
			total++;
			
			if(teixeira>falcao) {
				double percTexeira = (teixeira*100)/total;
				JOptionPane.showMessageDialog(null,"1°Ricardo Teixeira: " + teixeira + " votos-> " + percTexeira + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				if(falcao!=0) {
					double percFalcao = (falcao*100)/total;
					JOptionPane.showMessageDialog(null,"2°Paulo Falcao: " + falcao + " votos-> " + percFalcao + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"2°Paulo Falcao: 0 votos-> 0%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}else if(falcao>teixeira) {
				double percFalcao = (falcao*100)/total;
				JOptionPane.showMessageDialog(null,"1°Paulo Falcao: " + falcao + " votos-> " + percFalcao + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				if(falcao!=0) {
					double percTexeira = (teixeira*100)/total;
					JOptionPane.showMessageDialog(null,"2°Ricardo Teixeira: " + teixeira + " votos-> " + percTexeira + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);;
				}else {
					JOptionPane.showMessageDialog(null,"2°Ricardo Teixeira: 0 votos-> 0%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}

	}

	}
}
