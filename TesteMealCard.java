package TesteAtividade5;

import MealCardAtividade4.MealCard;

public class TesteMealCard {

	public static void main(String[] args) {
		MealCard valeSham = new MealCard("Sham", 200);
		MealCard valePedro = new MealCard("Pedro"); 
		//Inicio tabela
		System.out.println("   Item  |   Valor");
		
		//Debitos dos Creditos
		valeSham.comprar("Salgado", 5);
		valeSham.comprar("Sobremesa", 7);
		valeSham.comprar("Almoço", 10);
		valeSham.comprar("Jantar", 10);
		valeSham.comprar("Sorvete", 3);
		
		//Saldo
		valeSham.saldo();
		
		//Teste Recarregar
		valeSham.recarregar(100);
		
		//Saldo apos inserido mais saldo
		valeSham.saldo();
		
		
		//Teste Saldo Inincial
		valePedro.saldo();
		
	}

}
