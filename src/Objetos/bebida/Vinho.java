package bebida;

public class Vinho extends Bebida {
		public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSafra() {
		return safra;
	}

	public void setSafra(int safra) {
		this.safra = safra;
	}

		private String  tipo;
		private int safra;

	
	
	public boolean verificaPreco(double preco) {
			if(preco<25) {
				return true;
			}else {
		return false;
			}
	}

	public String mostrarBebida() {
	
		return "nome é " + this.getNome()+"\no tipo e "+this.getTipo()+"\n da safra "+this.safra+"\ncusta"+this.getPreco();
	}

}
