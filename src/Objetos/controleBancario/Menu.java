package controleBancario;

import javax.swing.JOptionPane;

public abstract class Menu  {
	private int opcao;
	private String mensagemMenu ;
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public String getMensagemMenu() {
		return mensagemMenu;
	}

	public void setMensagemMenu(String mensagemMenu) {
		this.mensagemMenu = mensagemMenu;
	}

	public void executar() {
	 executarMenu();
	}
	
	protected void executarMenu() {
		try {
		this.opcao= Integer.parseInt(JOptionPane.showInputDialog(this.mensagemMenu));
		}
		catch(NumberFormatException e ) {
			JOptionPane.showMessageDialog(null, "insira um numero", "Erro", JOptionPane.ERROR_MESSAGE);
			this.opcao= -1;
		}
		}
	protected abstract void AvaliarOpcaoEscolhida() ;
}
