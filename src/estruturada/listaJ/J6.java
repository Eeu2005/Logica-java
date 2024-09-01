package listaJ;


import java.util.Scanner;

public class J6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int centro =0,leste=0,norte=0,sul=0,oeste=0,contador=0,homem=0,mulher=0,homemCentro=0,mulherCentro=0,homemNorte=0,mulherNorte=0,homemSul=0,mulherSul=0,homemLeste=0,mulherLeste=0,homemOeste=0,mulherOeste=0;
		int homemMenorLeste =0,mulherMaiorSul=0;
		String resp = "sim";
			    double percHomemC = 0,percHomemL = 0,percHomemN=0,percHomemS=0,percHomemO=0,percMulherC = 0,percMulherL = 0,percMulherN=0,percMulherS=0,percMulherO=0,perchomenCentro=0,percMulherMaior=0;
		  
		while(resp.equalsIgnoreCase("sim")) {
		contador++;
		
			System.out.println("digite a sua idade ");
			int idade = sc.nextInt();
			
			System.out.println("Qual o seu sexo?\n1-->Masculino\n2-->Feminino\nQualquer outro--> desejo não informar");
			int sexo = sc.nextInt();
			int opiniao;
			while(true) {
				System.out.println("Qual a região que você reside?\n1->Centro\n2->Leste\n3->Norte\n4->Sul\n5->Oeste");
				opiniao = sc.nextInt();
				if(opiniao<=0||opiniao>5) {
					System.out.println("Região Invalida");
				}else {
					break;
				}
			}
				
			if(opiniao==1) {
				centro++;
				if(sexo==1) {
					homem++;
					homemCentro++;
				} else if(sexo==2) {
					mulher++;
					mulherCentro++;
				}
			} else if(opiniao==2) {
				leste++;
				if(sexo==1) {
					homem++;
					homemLeste++;
					if	(idade<18) {
						homemMenorLeste++;
					}
				}else if(sexo==2) {
					mulher++;
					mulherLeste++;
				}
			} else if(opiniao==3) {
				norte++;
				if(sexo==1) {
					homemNorte++;
					homem++;
					
				}else if(sexo==2) {
					mulherNorte++;
					mulher++;
				}
			}else if(opiniao==4) {
				sul++;
				if(sexo==1) {
					homem++;
					homemSul++;
				}else if(sexo==2) {
					mulher++;
					mulherSul++;
					if(idade>=18) {
						mulherMaiorSul++;
					}
				}
			}else if(opiniao==5) {
					oeste++;
					if(sexo==1) {
						homem++;
						homemOeste++;
					}else if(sexo==2) {
						mulher++;
						mulherOeste++;
						
					}
			}
		
			System.out.println("Nova consulta?\nSIM ou NÃO");
			resp = sc.next();
		}
			percHomemC= (homemCentro*100)/homem;
			 percHomemL= (homemLeste*100)/homem;
			 percHomemN= (homemNorte*100)/homem;
			 percHomemS= (homemSul*100)/homem;
			 percHomemO= (homemOeste*100)/homem;
			 percMulherC= (mulherCentro*100)/mulher;
			 percMulherL= (mulherLeste*100)/mulher;
			 percMulherN= (mulherNorte*100)/mulher;
			 percMulherS= (mulherSul*100)/mulher;
			 percMulherO= (mulherOeste*100)/mulher;
			 perchomenCentro= (homemCentro*100)/centro;
			 percMulherMaior=(mulherMaiorSul*100)/sul;
			 
		System.out.println("---------------------RESULTADO-----------------------");
		System.out.println("total de homens em: Centro-> "+homemCentro);System.out.println("total de mulheres em: Centro-> "+mulherCentro);System.out.println("Percentual de Homens em :Centro->"+percHomemC);System.out.println("Percentual de mulheres em :Centro->"+percMulherC);System.out.println(perchomenCentro+"% porcentagem dos moradores do centro são homens");
		System.out.println("total de homens em: Leste-> "+homemLeste);	System.out.println("total de mulheres em: Leste-> "+mulherLeste);System.out.println("Percentual de Homens em :Leste->"+percHomemL);System.out.println("Percentual de mulheres em :Leste->"+percMulherL);System.out.println("total de menores de idade Que reside no Leste"+homemMenorLeste);
		System.out.println("total de homens em: Norte-> "+ homemNorte);System.out.println("total de mulheres em: Norte-> "+ mulherNorte);System.out.println("Percentual de Homens em :Norte->"+percHomemN);System.out.println("Percentual de mulheres em :Norte->"+percMulherN);
		System.out.println("total de homens em: Sul-> "+homemSul);System.out.println("total de mulheres em: Sul-> "+mulherSul);System.out.println("Percentual de Homens em :sul->"+percHomemS);System.out.println("Percentual de mulheres em :Sul->"+percMulherS);System.out.println(+percMulherMaior+"% porcentagem de mulheres maiores de idade no Sul");
		System.out.println("total de homens em: oeste-> "+homemOeste);System.out.println("total de mulheres em: Oeste-> "+mulherOeste);System.out.println("Percentual de Homens em :Oeste->"+percHomemO);System.out.println("Percentual de mulheres em :Oeste->"+percMulherO);
		System.out.println("total de habitantes:"+contador);
	
		
		
		
		
		
		
		
		
	}

}
