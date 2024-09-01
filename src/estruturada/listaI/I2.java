package listaI;

public class I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("De A a Z:\n");
		
		char letra = 'A';
		
		for(letra = 'A';letra<='Z';letra++) {
			System.out.println(letra);
		}
		
		System.out.println("\nDe Z a A:\n");
		
		for(letra = 'Z';letra>='A';letra--) {
			System.out.println(letra);
		}
		
	}

}
