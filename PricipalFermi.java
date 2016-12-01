package FermiGame;

import javax.swing.JOptionPane;

public class PricipalFermi {

	public static void main(String[] args) {
		System.out.println("Benvindo ao Fermi Tente adivinhar...");
		Fermi jogo = new Fermi();
		int i = 1;
		int tentativas = 0;
		while(i != 0){
			tentativas++;
			int a = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero de 3 casa"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero de 3 casa"));
			int c = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero de 3 casa"));
			jogo.tentativa(a);
			jogo.tentativa(b);
			jogo.tentativa(c);
			System.out.println("Tentativas: "+tentativas);
			i = Integer.parseInt(JOptionPane.showInputDialog("Pressione '0' para sair"));
		}
		jogo.mostrar();
		
	}
}
