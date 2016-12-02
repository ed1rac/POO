package Fibonacci;

import java.util.Scanner;

public class FibonnacciPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib = new Fibonacci();
		Scanner scan = new Scanner(System.in);
		int n, i;
		System.out.print("Entre com o Numero de Fibbonaci: ");
		n = scan.nextInt();
		fib.acharNumero(n);
	}
}
