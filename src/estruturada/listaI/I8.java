package listaI;
	import java.util.Scanner;
public class I8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int matrix=0,senhorAneis=0 , nulo=0;
			
			for(int x = 1 ; x<=20;x++) {
			
				System.out.println("voto n°"+x +"\n");
				
				System.out.println("qual a sua franquia favorita? \n 1 para Senhor dos Aneis \n 2 para Matrix \n  qualquer outro para nulo");
				 int voto = sc.nextInt();
				 if(voto == 1) {
					 matrix++;
				 }else if( voto ==2) {
					 senhorAneis++;
				 }else {
					 nulo++;
				 }
			}
			System.out.println("Resultado da votação\n" );
			System.out.println("matrix:"+matrix);
			System.out.println("Senhor dos Aneis:"+senhorAneis);
			System.out.println("nulos:"+nulo);
			
			
			
	}

}
