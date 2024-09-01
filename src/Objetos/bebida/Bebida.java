package bebida;

public abstract class Bebida {
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	private String nome;
	private double preco;
	
	public abstract boolean verificaPreco(double preco);
	public abstract String mostrarBebida();
	
	
	
	
}
