package DesvioPadraoAtividade8;

import java.util.ArrayList;
import java.util.Scanner;

public class DesvioPadrao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre Com Valor de N: ");
		int n = scan.nextInt();
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		float media = 0;
		//Entrada de Valores
		for(int i = 0; i<n;i++){
			System.out.print("Entre com um valor X"+(i+1)+": ");
			vetor.add(scan.nextInt());
			//Soma para calculo de media
			media += vetor.get(i);
		}
		System.out.println("Amostras: "+vetor);
		//Calculo de Media
		media /= n;
		System.out.println("Media: "+media);
		
		//Calculando variancia
		float variancia = 0;
		for(int i = 0; i<n;i++){
			int item = vetor.get(i);
			variancia += Math.pow((item-media), 2);
		}
		variancia = variancia/(n-1);
		System.out.println("Variancia: "+variancia);
		System.out.format("Desvio Padrão: %.2f", Math.sqrt(variancia));
		scan.close();

	}

}
