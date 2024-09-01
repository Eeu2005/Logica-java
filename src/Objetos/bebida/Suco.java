package bebida;

public class Suco extends Bebida {

	private String sabor;
	
		public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public boolean verificaPreco(double preco) {
			if(preco<2.5) {
				return true;
			}else {
		return false;
			}
	}

	@Override
	public String mostrarBebida() {
		
		return  "Nome é " + this.getNome()+"\nO tipo e "+"\nCusta"+this.getPreco()+"\nSabor de "+ this.getSabor();
	}
	
}
