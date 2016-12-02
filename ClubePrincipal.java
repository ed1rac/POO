package ClubesAtividade6;

public class ClubePrincipal {

	public static void main(String[] args) {
		Dorm dorm = new Dorm();
		
		dorm.adicionar(new Clube("Clube de Ciencias da Computacao"));
		dorm.adicionar(new Clube("Clube de Biologia"));
		dorm.adicionar(new Clube("Clube de Bilhar"));
		dorm.adicionar(new Clube("Clube Sem Sono"));
		dorm.adicionar(new Clube("Clube de Degustação de Vinhos"));
		
		dorm.listar();
		//Adicione Membros
		dorm.adicionarMembro(4, "Solitarios", 90);
		dorm.adicionarMembro(0, new Membro("Marilda", 62));
		dorm.adicionarMembro(0, new Membro("Camila", 11));
		dorm.adicionarMembro(1, new Membro("Jonas", 19));
		dorm.adicionarMembro(1, new Membro("Jose", 26));
		dorm.adicionarMembro(2, new Membro("Matt", 78));
		dorm.adicionarMembro(2, new Membro("Telephone", 15));
		dorm.adicionarMembro(3, new Membro("Bob Stone", 25));
		dorm.adicionarMembro(3, new Membro("Judas", 123));
		dorm.adicionarMembro(4, new Membro("Pop", 90));
		
		dorm.listar();
		
		//Remova Membros
		dorm.removeMembro(0, 0);
		dorm.removeMembro(1, 1);
		dorm.removeMembro(1, 0);
		
		dorm.listar();
		
		//Altera Membro
		dorm.alterarMembro(0, 0, "James ALTERADO", 33);
		
		dorm.listar();
	}

}
