package Fibonacci;

public class Fibonacci {
	int total = 1;
	int atotal = 0;
	
	public void acharNumero(int x){
		int i = 2;
		System.out.println("F"+1+" = "+ 1);
		while(i<=x){
			int novo;
			novo = total + atotal;
			atotal = total;
			total = novo;
			System.out.println("F"+i+" = "+ total);
			i++;
		}
	}	
}
