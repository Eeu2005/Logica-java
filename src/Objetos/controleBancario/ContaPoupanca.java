package controleBancario;

public class ContaPoupanca extends Conta {
	private double reajusteMensal;
	ContaPoupanca(double saldo,double reajuste){
		this.setSaldo(saldo);
		this.reajusteMensal=reajuste;
}
public void atualizarSaldo(double reajuste) throws Exception {
		if(reajuste<=0) {
			throw new Exception("reajuste invalido");
		}else {
			double percReaj = (reajuste*this.getSaldo())/100;
			this.setSaldo(this.getSaldo() + percReaj);
			reajusteMensal= reajuste;
		}
	}
public String toString() {
	return "saldo:"+this.getSaldo()+"\n"+"o reajuste mensal é "+this.reajusteMensal;
}
	
}
