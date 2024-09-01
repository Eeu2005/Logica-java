package listaJ;

import java.util.Scanner;

public class J9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int compt=0,direito=0,letras=0,votos=0;
		double percCompt=0,percDir=0,percLet=0;
		String loop = "sim";
				while(loop.equalsIgnoreCase("sim")) {
					System.out.println("digite a sua Classe\n1->Ciencias da Computação\n2->direito\n3->letras");
					int opiniao = sc.nextInt();
					if(opiniao==1) {
						compt++;
					}else if(opiniao==2) {
						direito++;
					}else if(opiniao==3) {
						letras++;
					}
					votos++;
				
					System.out.println("Nova consulta?");
					loop = sc.next();
				}
				if(compt>letras && compt>direito) {
					System.out.println("1°lugar Ciencias da computação");
					if(letras>direito) {
						System.out.println("2°Lugar:letras");
						System.out.println("3°lugar:direito");
					}else if(letras<direito) {
						System.out.println("2°Lugar:direito");
						System.out.println("3°lugar:letras");
					}else if(letras==direito) {
						System.out.println("direito e letras empataram");
					}
					
				}else if(letras>compt && letras>direito) {
					System.out.println("1°lugar letras");
					if(compt>direito) {
						System.out.println("2°Lugar:Ciencias da computação");
						System.out.println("3°lugar:direito");
					}else if(compt<direito) {
						System.out.println("2°Lugar:direito");
						System.out.println("3°lugar:ciencias da computação");
					}else if(compt==direito) {
						System.out.println("ciencias da computação e direito empataram");
					}
				}
				else if(direito>compt && letras<direito) {
					System.out.println("1°lugar direito");
					if(compt>letras) {
						System.out.println("2°Lugar:Ciencias da computação");
						System.out.println("3°lugar:letras");
					}else if(compt<letras) {
						System.out.println("2°Lugar:letras");
						System.out.println("3°lugar:ciencias da computação");
					}else if(compt==letras) {
						System.out.println("ciencias da computação e letras empataram");
					}
				}else {
					System.out.println("houve empate");
				}
				percCompt= (compt*100)/votos;
				percDir = (direito*100)/votos;
				percLet= (letras*100)/votos;
				System.out.println("Votos:Ciencias da Computação"+compt);
				System.out.println("Votos:Direito"+direito);
				System.out.println("Votos:letras"+letras);
				System.out.println("porcentagem de Votos:Ciencias da Computação"+percCompt);
				System.out.println("porcentagem de Votos:Direito"+percDir);
				System.out.println("porcentagem de Votos:Letras"+percLet);

	}

}
