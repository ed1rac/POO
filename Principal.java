package BilheteriaAtividade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float totalVendas, numeroA, numeroB, numeroC, precoA, precoB, precoC;
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com os valores...");
		//Assento A
		System.out.print("Quantidades Bilhetes A: ");
		numeroA = scan.nextFloat();
		System.out.print("Preco dos Bilhetes A: ");
		precoA = scan.nextFloat();
		
		//Assento b
		System.out.print("Quantidades Bilhetes B: ");
		numeroB = scan.nextFloat();
		System.out.print("Preco dos Bilhetes B: ");
		precoB = scan.nextFloat();
		
		//Assento c
		System.out.print("Quantidades Bilhetes C: ");
		numeroC = scan.nextFloat();
		System.out.print("Preco dos Bilhetes C: ");
		precoC = scan.nextFloat();
		
		totalVendas = numeroA*precoA + numeroB*precoB + numeroC * precoC;
		
		System.out.format("Venda total de Bilhetes: R$ %.2f", totalVendas);
		scan.close();
	}

}
