package listaK;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class K11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número:","Fatorial",JOptionPane.INFORMATION_MESSAGE));
		int i=1,resp=1;
		
		
		do {
			resp*=i;
			i++;
		}while(i<=num);
	
		JOptionPane.showConfirmDialog(null, "O fatorial de " + num + " é = " + resp, "fatorial",JOptionPane.INFORMATION_MESSAGE);
	
	}

}
