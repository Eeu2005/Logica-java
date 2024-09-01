package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resp = "";
		int adm=0,psi=0,med=0,eng=0,nulo=0;
		int fem=0,masc=0,outro=0;
		int engMasc=0,psiFem=0,admFem=0,medFem=0;
		int pessoas=0;
		
		do {

			int sexo = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o seu sexo:\n1-Masculino\n2-Feminino\nOUTRO NÙMERO-Não desejo informar.","PESQUISA",JOptionPane.INFORMATION_MESSAGE));
			int curso = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o código do curso que você deseja cursar:\n1-Engenharia da Computação\n2-Administração\n3-Medicina\n4-Psicologia","PESQUISA",JOptionPane.INFORMATION_MESSAGE));
			
			switch(curso) {
			
			case 1:
				eng++;
				
				if(sexo ==1) {
					masc++;
					engMasc++;
				}else if(sexo==2) {
					fem++;
				}else {
					outro++;
				}
				
				break;
			case 2:
				adm++;
				if(sexo ==1) {
					masc++;
				}else if(sexo==2) {
					fem++;
					admFem++;
				}else {
					outro++;
				}
				break;
			case 3:
				med++;
				if(sexo ==1) {
					masc++;
				}else if(sexo==2) {
					fem++;
					medFem++;
				}else {
					outro++;
				}
				break;
				
			case 4:
				psi++;
				if(sexo ==1) {
					masc++;
				}else if(sexo==2) {
					fem++;
					psiFem++;
				}else {
					outro++;
				}
				break;
			default:
				nulo++;
			
			
			
			
			}
			
			pessoas++;
			
			
			resp  = JOptionPane.showInputDialog(null,"Deseja continuar?\nSIM ou NÃO","PESQUISA",JOptionPane.INFORMATION_MESSAGE);
		}while(resp.equalsIgnoreCase("sim"));
		
		JOptionPane.showMessageDialog(null,"Pessoas que pretender cursar Medicina:" + med, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Mulheres que pretender cursar Admnistração:" + admFem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		if(masc!=0) {
			double percMascEng = (engMasc*100)/masc;
			JOptionPane.showMessageDialog(null,"Homens que pretendem cursar Engenharia da Computação: " + percMascEng + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(fem!=0) {
			double percFemPsi = (psiFem*100)/fem;
			JOptionPane.showMessageDialog(null,"Mulheres que pretender cursar Psicologia:" + percFemPsi + "%.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}

		

	}

}
