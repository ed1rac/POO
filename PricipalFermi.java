package FermiGame;

import javax.swing.JOptionPane;
/** Classe que contem a função main que executa o código
 * 
 * @author Sham Vinicius Fiorin
 * @version 1.0
 */
public class PricipalFermi {
	/** Metodo principal do programa
	 * 
	 * @param args String[]
	 */
	public static void main(String[] args) {
		Fermi jogo = new Fermi();
		int i = 1;
		int tentativas = 0;
		while(i != 0){
			System.out.println("Chute |     Dica      |");
			tentativas++;
			int a = Integer.parseInt(JOptionPane.showInputDialog("Tentativa 1: "));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Tentativa 2: "));
			int c = Integer.parseInt(JOptionPane.showInputDialog("Tentativa 3: "));
			jogo.tentativa(a);
			jogo.tentativa(b);
			jogo.tentativa(c);
			System.out.println("Tentativas: "+tentativas);
			if(jogo.victory){
				System.out.print("PARABENS VOCÊ GANHOU, RESPOSTA: ");
				jogo.mostrar();
				System.out.println("\n Novo Jogo Iniciado!");
				jogo = new Fermi();
			}
			i = Integer.parseInt(JOptionPane.showInputDialog("0 PARA SAIR ou 1 PARA CONTINUAR"));
		}
		jogo.mostrar();
		
	}
}
