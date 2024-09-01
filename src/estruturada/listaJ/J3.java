package listaJ;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------PESQUISA PRODUTO----------\n");
		
		String resp = "sim";
		int masc=0,fem=0,outro=0;
		int sim=0,nao=0,nulo=0;
		int mulherSim=0, homemNao=0;
		
		while(resp.equalsIgnoreCase("sim")) {
			System.out.println("Informe seu sexo:\n1-Masculino\n2-Feminino\nOutro número- Desejo não informar");
			int sexo = sc.nextInt();
			System.out.println("Gostou do novo produto?\n1-SIM\n2-NÃO");
			int opiniao = sc.nextInt();
			
			
			if(sexo ==1 && opiniao==1) {
				sim++;
				masc++;
			}else if(sexo == 2 && opiniao ==1) {
				sim++;
				mulherSim++;
				fem++;
				
			}else if(sexo==1 && opiniao == 2) {
				masc++;
				homemNao++;
				nao++;
			}else if(sexo == 2 && opiniao == 2) {
				fem++;
				nao++;
			}
			else if(opiniao ==2) {
				nao++;
			}
			else if( opiniao ==1) {
				sim++;
			}else {
				nulo++;
			}
			
			
			
			System.out.println("Nova pesquisa?SIM ou NÃO");
			resp = sc.next();
			
			
		}
		
		
		
		System.out.println("--------------RESULTADO -------------------\n");
		System.out.println("Gostaram do produto:" + sim);
		System.out.println("Não gostaram do produto:" + nao);
		
		if(fem!=0) {
			double percMulherSim = (mulherSim*100)/fem;
			System.out.println("Mulheres que votaram SIM: " + percMulherSim + "%.");
		}	
		if(masc!=0) {
			double percHomemNao = (homemNao*100)/masc;
			System.out.println("Homens que votaram NÃO: " + percHomemNao+ "%." );
		}
		
		
		

		
	}

}
