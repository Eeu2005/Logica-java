package listaI;

public class I13 {

	public static void main(String[] args) {
		int resultsom= 0;
		long resultMult=1;
		for(int x=1;x<=20;x++) {
			if (x%2==0) {
				resultMult=+x*resultMult;
				//3.715.891.200
			}else {
				resultsom+=x;
			}
		}
		System.out.println("a soma dos impares são "+resultsom);
		System.out.println("a multiplicação dos pares são "+ resultMult);
	}

}
