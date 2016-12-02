package ClubesAtividade6;

import java.util.ArrayList;
import java.util.List;

public class Dorm {
	List<Clube> clubes = new ArrayList<Clube>();
	
	public void adicionar(Clube novo){
		clubes.add(novo);
	}
	public void adicionarMembro(int clube, String nome, int idade){
		clubes.get(clube).adicionar(new Membro(nome,idade));
	}
	public void adicionarMembro(int clube, Membro novo){
		clubes.get(clube).adicionar(novo);
	}
	public void removeMembro(int clube, int membro){
		clubes.get(clube).excluir(membro);
	}
	public void alterarMembro(int clube,int membro, String nome, int idade){
		clubes.get(clube).membros.get(membro).setNome(nome);
		clubes.get(clube).membros.get(membro).setIdade(idade);
	}
	
	public void listar(){
		int i;
		System.out.println("-------------------------------------------------------");
		int x = clubes.size();
		for (i=0;i<x;i++){
			Clube atual = clubes.get(i);
			System.out.println(i+": Nome do Clube: "+atual.nome);
			atual.listar();
			System.out.println();
			}
		
	}
}
