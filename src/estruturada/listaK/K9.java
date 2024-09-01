package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String resp = "";
		int ferrari=0,porsche=0,mercedes=0,total=0,nulo=0;
		double percFerrari=1,percPorsche=1,percMercedes=1;
		
		do {
			int voto =Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a seu voto:\n1-Ferrari\n2-Porsche\n3-Mercedes","Pesquisa", JOptionPane.INFORMATION_MESSAGE));;
			
			
			switch(voto) {
			
			case 1:
				ferrari++;
				total++;
				break;
			case 2:
				porsche++;
				total++;
				break;
			case 3:
				mercedes++;
				total++;
				break;
			default:
				nulo++;
			
			}
			
			resp  = JOptionPane.showInputDialog(null,"Deseja continuar?\nSIM ou NÃO","PESQUISA",JOptionPane.INFORMATION_MESSAGE);
		}while(resp.equalsIgnoreCase("sim"));

		percFerrari = (ferrari*100)/total;
		percPorsche = (porsche*100)/total;
		percMercedes = (mercedes*100)/total;
		
		

		
		if(ferrari==porsche && porsche==mercedes) {
			JOptionPane.showMessageDialog(null,"EMPATE TRIPLO", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(ferrari>porsche&& porsche>=mercedes) {				
			JOptionPane.showMessageDialog(null,"1°Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}else if(ferrari>mercedes&& mercedes>=porsche) {
			JOptionPane.showMessageDialog(null,"1°Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE); 
			JOptionPane.showMessageDialog(null,"2°Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
	
		}else if(porsche>ferrari&& ferrari>=mercedes) {
			JOptionPane.showMessageDialog(null,"1°Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		else if(porsche>mercedes&& mercedes>=ferrari) {
			JOptionPane.showMessageDialog(null,"1°Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		else if(mercedes>ferrari&& ferrari>=porsche) {
			JOptionPane.showMessageDialog(null,"1°Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE); 
			JOptionPane.showMessageDialog(null,"3°Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
		}
		else if(mercedes>porsche&& porsche>=ferrari) {
			JOptionPane.showMessageDialog(null,"1°Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"3°Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		else if(ferrari==porsche) {
			JOptionPane.showMessageDialog(null,"EMPATE", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			

			
			
		}
		else if(ferrari==mercedes) {
			JOptionPane.showMessageDialog(null,"EMPATE", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
			
		}
		else if(porsche==mercedes) {
			JOptionPane.showMessageDialog(null,"EMPATE", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Mercedes: " + mercedes+ " votos-> " + percMercedes+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"1°Porsche: " + porsche+ " votos-> " + percPorsche+ "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,"2°Ferrari: " + ferrari+ " votos-> " + percFerrari + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		
		
	}

}
