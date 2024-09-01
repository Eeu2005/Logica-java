package controleBancario;

public class ContaCorrente extends Conta {

	private double  limiteEspecial;
		ContaCorrente(double saldo,double limite){
			this.setSaldo(saldo);
			this.limiteEspecial=limite;
	}
	public void sacar(double valor) throws Exception {
		double maximo = limiteEspecial+this.getSaldo();
		if(valor<=0) {
			throw new Exception("não se pode sacar valor 0 ou negativo");
		}else if(valor>maximo) {
			throw new Exception("Valor sacado maior que o limite");
		}else {
			if(this.getSaldo()-valor>0) {
				this.setSaldo(this.getSaldo() - valor);
			}else {
				valor-=this.getSaldo();
				this.setSaldo(0);
				limiteEspecial-=valor;
				
			}
		}
	}
	public String toString() {
		return "saldo:"+this.getSaldo()+"\n"+"limite Especial:"+this.limiteEspecial;
	}
	
}
