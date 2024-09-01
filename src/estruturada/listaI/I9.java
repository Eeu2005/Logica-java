package listaI;
import java.util.*;
public class I9 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("digite a quantidades de rodadas");
	int qtde = sc.nextInt();
	int maiorNumero =0,menorNumero= 999999999;
	for(int x =1; x<= qtde;x++) {
	
		System.out.println("digite um numero legal");
		int num = sc.nextInt();
		
		if(menorNumero>=num) {
			menorNumero =num;
		}else {
			maiorNumero = num;
		}
		
	}
		
	System.out.println("\n");
System.out.println("o maior numero legal que você escolheu foi "+maiorNumero);
System.out.println("o menor numero legal que voce escolheu foi "+ menorNumero);
	}

}
