package listaK;

public class K10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0;
		int num = 0;
		
		do {
			
			
			if(i%2!=0) {
				num+= i;
				
			}
			
			i++;
		}while(i<=20);
		
		
		System.out.println("Soma dos números ímpares de 1 a 20 = "+ num);
		
		i=1;
		
		long x = 1;
		
		
		do {
			
			
			if(i%2==0) {
				x*= i;
				
			}
			
			i++;
		}while(i<=20);
		
		System.out.println("Multiplicação dos números pares de 1 a 20 = "+ x);
		
	}

}
