package listaJ;

import java.util.Scanner;

public class J8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
			int fujiro =0 , takaro=0,nulo=0,tot=0;
			String resp = "sim",res="";
			while(resp.equalsIgnoreCase("Sim")){
				System.out.println("digite o numero do candidato\n1->Fujiro NaKombi\n2->TakaroNé\nQualquer outro-> nulo");
				int voto = sc.nextInt();
				if(voto==1) {
					fujiro++;
				}else if (voto==2){
					takaro++;
				}else {
					nulo++;
				}
				System.out.println("nova consulta sim ou nao");
				resp = sc.next();
					if(fujiro==takaro) {
						System.out.println("voto de minerva");
						resp ="sim";
					} else if(takaro>fujiro) {
						res = "takaro Né";
					}else if (takaro<fujiro){
						res ="fujiro";
					}
			}
			tot = fujiro+takaro+nulo;
			 double pecFuji = (fujiro*100)/tot;
			double pecTak = (takaro*100)/tot;
			System.out.println("------Resultado------=-");
			System.out.println("ganhador foi "+res);
			System.out.println("takaroNé votos:"+takaro);
			System.out.println("Fujiro NaKombi votos: "+fujiro);
			System.out.println("porcentagem de votos:TakaroNé "+pecTak);
			System.out.println("porcentagem de votos Fujiro NaKombi "+pecFuji);
	}
			
}
