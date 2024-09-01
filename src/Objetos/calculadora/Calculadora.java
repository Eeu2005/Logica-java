package calculadora;

public class Calculadora {
	public String tipo ="normal";
	
	private int somar(int[] x ) {
		int soma =0;
		for(int i=0;i<x.length;i++) {
			soma+=x[i];
		}
		return  soma;
	}
	
	private int subtrair(int[] x ) {
		int sub =x[0];
		for(int i=1;i<x.length;i++) {
			sub-=x[i];
		}
		return sub;
		
	}
	private int multplicar (int[] x) {
		int mult =x[0];
		for(int i=1;i<x.length;i++) {
			mult =x[i] * mult;
		}
		return  mult;
	}
	private  int dividir(int[] x) {
		int div =x[0];
		for(int i=1;i<x.length;i++) {
				if(x[i]==0) {
					return 0;
				}else {
			div = x[i]/div;
				}
		}
		 return  div;
	}
	public int calcular(int[] vetor,String operacao) {
		switch(operacao) {
		case "+":
		return this.somar(vetor);
		case "-":
			return this.subtrair(vetor);
		case "*":
			return this.multplicar(vetor);
		case "/":
			return this.dividir(vetor);
		default:
			return 0;
		}
		
		
	}

}
