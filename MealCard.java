package MealCardAtividade4;

public class MealCard {
	String dono;
	int saldo;
	
	public MealCard(String dono) {
		this.dono = dono;
		this.saldo = 100;
	}

	public MealCard(String dono, int saldo) {
		super();
		this.dono = dono;
		this.saldo = saldo;
	}
	
	public void recarregar(int valor){
		this.saldo += valor;
		System.out.println("Adicionados R$ " +valor);
	}
	
	public void comprar(String nome,int valor){
		if (saldo >= valor){
			saldo -= valor;
			System.out.println(nome +" | "+valor+" Pontos");
		}
		else{
			System.out.println("Saldo Insuficiente para Compra");
		}
	}
	public void saldo(){
		System.out.println("Saldo Total de R$ "+saldo);
	}
}
