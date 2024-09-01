package listaJ;

import java.util.Scanner;

public class J7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int senhor= 0 , matrix =0;
		
		String resp= "sim" ,res = "";
		
			while(resp.equalsIgnoreCase("Sim")) {
				System.out.println("qual a melhor Saga?\n1->matrix\n2Senhor dos Aneis");
				int opiniao = sc.nextInt();
				if(opiniao==2) {
					senhor++;
				}else if(opiniao==1) {
					matrix++;
				}
				
				System.out.println("Deseja continuar Sim ou Não");
				resp  =sc.next();
			}
			if(senhor==matrix) {
				res ="houve um impate";
				
			}else if(senhor>matrix) {
				res ="senhor dos Aneis";
			}else if(senhor < matrix) {
				res ="matrix";
			}
			
		System.out.println("o resultado é "+res);
			System.out.println("matrix votos:"+matrix);
			System.out.println("Senhor dos Aneis:"+senhor);
	}

}
