package FermiGame;

import java.util.Random;

public class Fermi {
	Random rand = new Random();
	private int number[] = new int[3];
	public Fermi() {
		this.number[0] = rand.nextInt(10);
		this.number[1] = rand.nextInt(10);
		this.number[2] = rand.nextInt(10);
	}
	public void tentativa(int numero){
		int save = numero;
		int item[] = new int[3];
		item[0] = numero/100;
		numero = numero%100;
		item[1] = numero/10;
		numero = numero%10;
		item[2] = numero;
		int i;
		System.out.print(save+" ");;
		for (i=0;i<3;i++){
			if (item[i] == number[i]){
				System.out.print("  Fermi");
			}
			else if (item[i] == number[0] || item[i] == number[1] ||item[i] == number[2]){
				System.out.print("  Pico");
			}
			else{
				System.out.print("  Nano");
				
			}
		}
		System.out.println();
	}
	public void mostrar(){
		System.out.print(number[0]);
		System.out.print(number[1]);
		System.out.println(number[2]);
	}
}
