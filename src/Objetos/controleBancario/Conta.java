package controleBancario;

public class Conta {

	private double saldo;
	
	public void depositar(double valor) throws Exception {
		if (valor<=0) {
			throw new Exception("valor menor ou igual a zero"); 
		}else {
			this.saldo+=valor;
		}
			
	}
	public void sacar(double valor) throws Exception {
		double temp = saldo-valor;
		if(valor<=0) {
			throw new Exception("não se pode sacar valor 0 ou negativo");
		}else if(temp<0) {
			 throw new Exception("valor sacado  maior que saldo");
		}else {
		 saldo=temp;
		}
	}
	public void atualizarSaldo() {
		if(this.saldo<0) {
			double calc = this.saldo*0.08;
			this.saldo = this.saldo-calc;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
