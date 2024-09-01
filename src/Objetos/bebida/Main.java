package bebida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner (System.in);
				Vinho meuVinho = new Vinho();
				Suco meuSuco = new Suco();
				Refrigerante Refri = new Refrigerante();
				boolean loop = true;
				while(loop) {
				System.out.println("digite \n1->cadastrar\n2->verificar preço\n3->Visualizar dados");
				int descicao= sc.nextInt();
				switch (descicao) {
				case 1:
					System.out.println("Qual produto deseja cadastrar \n1->Vinho\n2->Suco\n3-> Refrigerante");
					int cadDesc = sc.nextInt();
						if(cadDesc==1) {
							System.out.println("digite o nome do vinho");
							meuVinho.setNome(sc.next());
							System.out.println("digite o safra do vinho");
							meuVinho.setSafra(sc.nextInt());
							System.out.println("digite o preço do vinho");
							meuVinho.setPreco(sc.nextDouble());
							System.out.println("digite o tipo do vinho");
							meuVinho.setTipo(sc.next());
						}else if(cadDesc==2) {
							System.out.println("digite o nome do suco");
							meuSuco.setNome(sc.next());
							System.out.println("digite o preço do suco");
							meuSuco.setPreco(sc.nextDouble());
							System.out.println("digite o sabor do suco");
							meuSuco.setSabor(sc.next());
						}else if(cadDesc==3) {
							System.out.println("digite o nome do refrigerante");
							Refri.setNome(sc.next());
							System.out.println("digite o preço do refrigerante");
							Refri.setPreco(sc.nextDouble());
							System.out.println("digite o refrigerante e retornavel? \n1->sim \nOutro->não");
							int retornavel = sc.nextInt();
							if(retornavel==1) {Refri.setRetornavel(true);}
							else {Refri.setRetornavel(false); }
						}
						break;
				case 2:
					System.out.println("Qual produto deseja verificar o preco \n1->Vinho\n2->Suco\n->3 Refrigerante");
					int  precDesc = sc.nextInt();
						if(precDesc==1) {
								if(meuVinho.verificaPreco(meuVinho.getPreco())) {
									System.out.println("produto em oferta");
										
								}else {
									System.out.println("produto com preço normal");
								}
							
						}
						else if(precDesc==2) {
								if(meuSuco.verificaPreco(meuSuco.getPreco())) {
									System.out.println("produto em oferta");
										
								}else {
									System.out.println("produto com preço normal");
								}
							
						}
						else if(precDesc==3) {
							if(Refri.verificaPreco(Refri.getPreco())) {
								System.out.println("produto em oferta");
									
							}else {
								System.out.println("produto com preço normal");
							}
						}
						break;
				case 3:
					System.out.println("Qual produto deseja o \n1->Vinho\n2->Suco\n->3 Refrigerante");
					int  dadDesc = sc.nextInt();
					if(dadDesc==1) {
						System.out.println(meuVinho.mostrarBebida());
					}else if(dadDesc==2) {
						System.out.println(meuSuco.mostrarBebida());
					}else if(dadDesc==3) {
						System.out.println(Refri.mostrarBebida());
					}
					break;
				default:
					loop=false;
					break;
				}
				}
				sc.close();
				
	}

}
