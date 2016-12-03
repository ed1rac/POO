package FermiGame;

import java.util.Random;
/** Classe para Interação do jogo Fermi
 * 
 * @author Sham Vinicius Fiorin
 * @version 1.0
 * 
 */
public class Fermi {
	Random rand = new Random();
	private int number[] = new int[3];
	boolean victory;
	
	/** Construtor sem parametros iniciando
	 *  aleatórios os atributos
	 * 
	 */
	public Fermi() {
		this.number[0] = rand.nextInt(10);
		this.number[1] = rand.nextInt(10);
		this.number[2] = rand.nextInt(10);
		this.victory = false;
	}
	
	/** Método para fazer entradas de 3 Tentativas e analisar casos
	 * dar imprimir na tela resultados e dicas
	 * 
	 * @param numero int - Valor para ser testado
	 *
	 */
	public void tentativa(int numero){
		int save = numero;
		int item[] = new int[3];
		item[0] = numero/100;
		numero = numero%100;
		item[1] = numero/10;
		numero = numero%10;
		item[2] = numero;
		int i, flag = 0;
		System.out.print(save+" ");
		for (i=0;i<3;i++){
			if (item[i] == number[i]){
				System.out.print("  Fermi");
				flag++;
			}
			else if (item[i] == number[0] || item[i] == number[1] ||item[i] == number[2]){
				System.out.print("  Pico");
			}
			else{
				System.out.print("  Nano");
			}
		}
		System.out.println();
		if(flag == 3)
			this.victory = true;
	}
	/** Metódo para Verificar Vitória
	 * 
	 */
	public boolean vitoria(){
		return this.victory;
	}
	
	/** Metódo para imprimir a resposta em tela
	 * 
	 */
	public void mostrar(){
		System.out.print(number[0]);
		System.out.print(number[1]);
		System.out.println(number[2]);
	}
}
