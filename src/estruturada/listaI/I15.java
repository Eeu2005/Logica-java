package listaI;
import java.util.*;
public class I15 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			System.out.println("POTENCIA\n");
	System.out.println("digite a base");
	int base = sc.nextInt();
	System.out.println("digite o expoente");
	int exp = sc.nextInt();
	int result = 1;
	for(int x =0;x<exp;x++) {
		result = result *base;
	}
	System.out.println("resultado é: "+result);

	}

}
