package listaI;
import java.util.*;
public class I14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o numero a ser fatorado");
			int num = sc.nextInt();
			int result  =1;
			for(int x = num;x>=1;x--) {
				result = x*result;
			}
			System.out.println("o fatorial é  "+ result);
	}

}
