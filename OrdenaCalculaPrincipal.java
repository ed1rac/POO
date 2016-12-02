package ListaLinkadaAtividade9;

import java.util.LinkedList;
import java.util.Random;

public class OrdenaCalculaPrincipal {
	
	public static void lista(){
		Random random = new Random();
		LinkedList<Integer> lista = new LinkedList<Integer>();
		for(int i=0;i<25;i++){
			lista.add(random.nextInt(101));
		}
		lista.sort(null);
		int soma = 0, item;
		for(int i=0;i<lista.size();i++){
			item = lista.get(i);
			soma += item;
		}
		float media = (float)soma;
		media /= 25;
		System.out.println("Todos Itens: " + lista+"\nSoma Itens: "+soma);
		System.out.format("Media dos Itens: %.2f\n", media);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lista();
	}

}
