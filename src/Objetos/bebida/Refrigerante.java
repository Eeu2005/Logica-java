package bebida;

public class Refrigerante extends Bebida {
	
	public boolean isRetornavel() {
		return retornavel;
	}

	public void setRetornavel(boolean retornavel) {
		this.retornavel = retornavel;
	}

	private boolean retornavel;
	
	
	@Override
	public boolean verificaPreco(double preco) {
			if(preco<5) {
				return true;
			}else {
				return false;
			}
	}

	@Override
	public String mostrarBebida() {
		if(this.isRetornavel()) {
			return "nome é " + this.getNome()+"\nO Tipo e "+"\nCusta"+this.getPreco()+"\nÉ retornavel";
		}else {
			return "nome é " + this.getNome()+"\nO Tipo e "+"\nCusta"+this.getPreco()+"\nNão é retornavel";
		}
		
	}

}


