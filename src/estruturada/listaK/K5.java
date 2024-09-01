package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int fem=0,masc=0,outro=0;
		int zl=0,zo=0,zn=0,zs=0,centro=0;
		int zlMasc=0,zlFem=0,zoMasc=0,zoFem=0,znMasc=0,znFem=0,zsMasc=0,zsFem=0,centroMasc=0,centroFem=0;
		int maior=0,menor=0;
		int menorZlMasc=0,menorZoMasc=0,menorZnMasc=0,menorZsMasc=0,menorCentroMasc=0;
		int maiorZlFem=0,maiorZoFem=0,maiorZnFem=0,maiorZsFem=0,maiorCentroFem=0;
		int total=0;
		String resp = "";
		
		do {

			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade:","Pesquisa", JOptionPane.QUESTION_MESSAGE));
			int regiao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua região:\n1-Centro\n2-Leste\n3-Norte\n4-Oeste\n5-Sul"," Pesquisa",JOptionPane.QUESTION_MESSAGE));
			int sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o seu sexo:\n1-Masculino\n2-Feminino\nOUTRO NÙMERO-Não desejo informar.","Pesquisa", JOptionPane.QUESTION_MESSAGE));
			
			if(idade<18) {
				menor++;
				switch(sexo) {
				
				case 1:
					masc++;
					if(regiao ==1) {
						centro++;
						centroMasc++;
						menorCentroMasc++;
					}else if(regiao ==2) {
						zl++;
						zlMasc++;
						menorZlMasc++;
					}
					else if(regiao ==3) {
						zn++;
						znMasc++;
						menorZnMasc++;
					}
					else if(regiao ==4) {
						zo++;
						zoMasc++;
						menorZoMasc++;
					}
					else if(regiao ==5) {
						zs++;
						zsMasc++;
						menorZsMasc++;
					}
					break;
				case 2:
					fem++;
					if(regiao ==1) {
						centro++;
						centroFem++;
					}else if(regiao ==2) {
						zl++;
						zlFem++;
					}
					else if(regiao ==3) {
						zn++;
						znFem++;
					}
					else if(regiao ==4) {
						zo++;
						zoFem++;
					}
					else if(regiao ==5) {
						zs++;
						zsFem++;
					}
					break;
				default:
					if(regiao ==1) {
						centro++;
					}else if(regiao ==2) {
						zl++;
					}
					else if(regiao ==3) {
						zn++;
					}
					else if(regiao ==4) {
						zo++;
					}
					else if(regiao ==5) {
						zs++;
					}
			}
				
			}else {
				maior++;
				switch(sexo) {
				
					case 1:
						masc++;
						if(regiao ==1) {
							centro++;
							centroMasc++;
						}else if(regiao ==2) {
							zl++;
							zlMasc++;
						}
						else if(regiao ==3) {
							zn++;
							znMasc++;
						}
						else if(regiao ==4) {
							zo++;
							zoMasc++;
						}
						else if(regiao ==5) {
							zs++;
							zsMasc++;
						}
						break;
					case 2:
						fem++;
						if(regiao ==1) {
							centro++;
							centroFem++;
							maiorCentroFem++;
						}else if(regiao ==2) {
							zl++;
							zlFem++;
							maiorZlFem++;
						}
						else if(regiao ==3) {
							zn++;
							znFem++;
							maiorZnFem++;
						}
						else if(regiao ==4) {
							zo++;
							zoFem++;
							maiorZoFem++;
						}
						else if(regiao ==5) {
							zs++;
							zsFem++;
							maiorZsFem++;
						}
						break;
					default:
						if(regiao ==1) {
							centro++;
						}else if(regiao ==2) {
							zl++;
						}
						else if(regiao ==3) {
							zn++;
						}
						else if(regiao ==4) {
							zo++;
						}
						else if(regiao ==5) {
							zs++;
						}
				}
			}
				
			
			
			total++;
			
			
			
			resp = JOptionPane.showInputDialog(null, "Deseja continuar?\nSIM ou NÃO", "Pesquisa",JOptionPane.INFORMATION_MESSAGE);
		}while(resp.equalsIgnoreCase("sim"));
		
		JOptionPane.showMessageDialog(null,"HOMENS:\nZona Leste= " +zlMasc+"\nZona Central= " + centroMasc, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		if(fem!=0) {
			double percFemZo= (zoFem*100)/fem;
			double percFemZn= (znFem*100)/fem;
			double percFemZs = (zsFem*100)/fem;
			double percFemCentro= (centroFem*100)/fem;
			JOptionPane.showMessageDialog(null,"MULHERES:\nZona Norte= " +percFemZo+"%\nZona Norte= " + percFemZn + "%\nZona Sul= " + percFemZs + "\nCentral= " + percFemCentro + "%", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}

		JOptionPane.showMessageDialog(null,"Total de Homens menores de 18 que moram na Zona Norte: " + menorZnMasc, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
		if(zoFem!=0) {
			double percFemZoMaior= (maiorZoFem*100)/zoFem;
			JOptionPane.showMessageDialog(null,"Percentual de Mulheres maiores de 18 que moram na Zona Oeste: " + percFemZoMaior, "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		
		

	}

}
