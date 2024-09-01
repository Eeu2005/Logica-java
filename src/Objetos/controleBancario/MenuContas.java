package controleBancario;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class MenuContas extends Menu {
	private ContaCorrente ContaCC;
	private ContaPoupanca ContaCP;
	public MenuContas() {
		ContaCC = new ContaCorrente(500,1000);
		ContaCP = new ContaPoupanca(5000,1);
	}
	 protected void executarMenu() {
		 this.setMensagemMenu("digite\n1-Conta Corrente\n2-ContaPoupança\n0-Sair");
		 super.executarMenu();
		 this.AvaliarOpcaoEscolhida();
	 }
	protected void AvaliarOpcaoEscolhida() {
		switch (this.getOpcao()) {
		case 1:
			this.operarContaCC();
			break;
		case 2:
			this.operarContaCP();
			break;
		case 0:
			break;
		default:
			JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA", "Erro", JOptionPane.ERROR_MESSAGE);
			this.executarMenu();
			break;
		}

	}
		private void operarContaCC() {
			this.setMensagemMenu("digite\n1-consultar Saldo\n2-depositar\n3-sacar\n4-atualizar Saldo\n0-voltar");
			super.executarMenu();
			switch (this.getOpcao()) {
			case 1:
				JOptionPane.showMessageDialog(null, ContaCC.toString(), "Informação da conta", JOptionPane.INFORMATION_MESSAGE);
				this.operarContaCC();
				break;
			case 2:	
				try {
					double valor =Double.parseDouble(JOptionPane.showInputDialog("digite o valor a ser depositado"));
					ContaCC.depositar(valor);
					this.operarContaCC();
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor não numerico", "Erro", JOptionPane.ERROR_MESSAGE);
					this.operarContaCC();
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);;
					this.operarContaCC();
				}
				break;
			case 3:
				
				try {
				double valor =Double.parseDouble(JOptionPane.showInputDialog("digite o valor a ser sacado"));
					ContaCC.sacar(valor);
					this.operarContaCC();
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "valor não numerico", "Erro", JOptionPane.ERROR_MESSAGE);
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case 4 :
				ContaCC.atualizarSaldo();
				this.operarContaCC();
			case 0:
				this.executarMenu();
				this.setOpcao(-1);
				break;
			default:
				JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA", "Erro", JOptionPane.ERROR_MESSAGE);
					this.operarContaCC();
				break;
			}
			
		}
		private void operarContaCP() {
			this.setMensagemMenu("digite\n1-consultar Saldo\n2-depositar\n3-sacar\n4-atualizar Saldo\n0-voltar");
			super.executarMenu();
			switch (this.getOpcao()) {
			case 1:
				JOptionPane.showMessageDialog(null, ContaCP, "Informação da conta", JOptionPane.INFORMATION_MESSAGE);
				this.operarContaCP();
				break;
			case 2:
				try {
				double valor =Double.parseDouble(JOptionPane.showInputDialog("digite o valor a ser depositado"));
				ContaCP.depositar(valor);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor não numerico", "Erro", JOptionPane.ERROR_MESSAGE);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			}
				this.operarContaCP();
			break;
			case 3:
				
				try {
					double valor =Double.parseDouble(JOptionPane.showInputDialog("digite o valor a ser sacado"));
						ContaCP.sacar(valor);
						break;
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "valor não numerico" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
					}
				this.operarContaCP();
				break;
			case 4 :
				try {
				double valor =Double.parseDouble(JOptionPane.showInputDialog("digite o valor a ser sacado"));
				ContaCP.atualizarSaldo(valor);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "VALOR INVALIDO", "Erro", JOptionPane.ERROR_MESSAGE);
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				}
				this.operarContaCP();
			case 0:
				executarMenu();
				this.setOpcao(-1);
				break;
			default:
				JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA", "Erro", JOptionPane.ERROR_MESSAGE);
				this.operarContaCP();
				break;
			}
			
		}


}
