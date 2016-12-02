package ClubesAtividade6;

import java.util.ArrayList;
import java.util.List;

public class Clube {
	String nome;
	List<Membro> membros = new ArrayList<Membro>();
	
	public Clube(String nome) {
		this.nome = nome;
	}
	
	public void adicionar(Membro novo){
		membros.add(novo);
	}
	
	public void excluir(int indice){
		membros.remove(indice);
	}
	
	public void listar(){
		int i;
		int x = membros.size();
		for (i=0;i<x;i++){
			Membro atual;
			atual = membros.get(i);
			System.out.println("      -Indice "+i+" Nome: "+ atual.getNome()+" Idade: "+atual.getIdade());
		}
	}
}
