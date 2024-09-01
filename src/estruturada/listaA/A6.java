package lista1;
import java.util.*;
public class A6 {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

		System.out.println("Digite a quantidade Trabalhada");
		int ht = sc.nextInt();
		
		System.out.println("digite o valor da hora");
		double vh = sc.nextDouble();
		
		System.out.println("digite o valor do desconto");
		double pd = sc.nextDouble();
		
		double sb = ht*vh;
		double desconto = (pd*100)*sb;
		double sl = desconto-sb;

		System.out.println("salario liquido de "+sl);
		System.out.println("salario Bruto" + sb);
		System.out.println("desconto de" +desconto+"%");

		
	}

}
