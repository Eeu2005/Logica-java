package listaJ;
import java.util.*;
public class J4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int homemEngComp=0,Homemadmin=0,mulherMed=0,mulherPsi=0,med=0,contador=0, mulher=0,homen=0 ;
		double percMed=0,percHomenAdmin=0,percMulherMed=0;
		String loop = "Sim";
		while(loop.equalsIgnoreCase("Sim")) {
			contador++;
			System.out.println("Qual o seu SEXO:\n1-Homem\n2-Mulher\nQualquer outro numero-- desejo não Informar");
			int sexo = sc.nextInt();
			
			System.out.println("Digite o numero da universidade\n1-Engenharia da Computação\n2-Administração\n3-Medicina\n4-Psicologia");
			int cod = sc.nextInt();
			
			if(sexo == 1 ) {
				homen++;
				if(cod==1) {
					homemEngComp++;
				}else if(cod==2) {
					Homemadmin++;
				}else if(cod==3) {
					med++;
				}
			}else if(sexo==2) {
				mulher++;
				if(cod==4) {
					mulherPsi++;
				}else if(cod==3) {
					med++;
					mulherMed++;
				}
			}else {
				if(cod ==3) {
					med++;
				}
			}
			if(med>0) {
				 percMed = (med*100)/contador;
			}
			if(Homemadmin>0) {
				 percHomenAdmin = (percHomenAdmin*100)/homen;
			}
			if(mulherMed>0) {
				percMulherMed = (mulherMed*100)/mulher;
			}
			
			System.out.println("deseja repetir?");
			loop = sc.next();
		}
		System.out.println("-------RESULTADO-----------");
		System.out.println("Total de homens que pretendem estudar Engenharia da Compução:"+homemEngComp);
		System.out.println("Total de Mulheres que pretendem estudar Psicologia:"+mulherPsi);
		System.out.println("percentual de pessoas que preferem estudar Medicina:"+percMed);
		System.out.println("Percentual de homnes que pretendem estudar Administração:"+percHomenAdmin);
		System.out.println("Perncentual de mulheres que pretendem estudar Medicina:"+percMulherMed);
		
	}
}
