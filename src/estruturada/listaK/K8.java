package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Z8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int medicina=0,psicologia=0,engenharia=0,total=0,nulo=0;
		double percMedicina=1,percPsicologia=1,percEngenharia=1;
		
		String resp = "";
		
		do {
			
			int voto =Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a seu voto:\n1-Medicina\n2-psicologia\n3-Engenharia Elétrica","Pesquisa", JOptionPane.INFORMATION_MESSAGE));;
			
			switch(voto) {
			
			case 1:
				medicina++;
				break;
			case 2:
				psicologia++;
				break;
			case 3:
				engenharia++;
				break;
			default:
				nulo++;
			
			}
			

			
			total++;
			resp  = JOptionPane.showInputDialog(null,"Deseja continuar?\nSIM ou NÃO","PESQUISA",JOptionPane.INFORMATION_MESSAGE);
		}while(resp.equalsIgnoreCase("sim"));
		
		
		percMedicina = (medicina*100)/total;
		percPsicologia = (psicologia*100)/total;
		percEngenharia = (engenharia*100)/total;
		

		if(medicina==psicologia && psicologia==engenharia) {
			JOptionPane.showMessageDialog(null,"EMPATE TRIPLO", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(medicina>psicologia&& psicologia>=engenharia) {				
			JOptionPane.showMessageDialog(null,"1°Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(medicina>engenharia&& engenharia>=psicologia) {
			JOptionPane.showMessageDialog(null,"1°Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
	
		}else if(psicologia>medicina&& medicina>=engenharia) {
			JOptionPane.showMessageDialog(null,"1°Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		else if(psicologia>engenharia&& engenharia>=medicina) {
			JOptionPane.showMessageDialog(null,"1°Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		else if(engenharia>medicina&& medicina>=psicologia) {
			JOptionPane.showMessageDialog(null,"1°Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}
		else if(engenharia>psicologia&& psicologia>=medicina) {
			JOptionPane.showMessageDialog(null,"1°Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		else if(medicina==psicologia) {
			JOptionPane.showMessageDialog(null,"EMPATE", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			

			
			
		}
		else if(medicina==engenharia) {
			JOptionPane.showMessageDialog(null,"EMPATE", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
			
			
		}
		else if(psicologia==engenharia) {
			JOptionPane.showMessageDialog(null,"EMPATE", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Engenharia Elétrica: " + engenharia+ " votos-> " + percEngenharia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Psicologia: " + psicologia+ " votos-> " + percPsicologia+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Medicina: " + medicina+ " votos-> " + percMedicina + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		
		
		
		
		
		
		
	}

}
