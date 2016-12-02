package JogoAritimetico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalAritmetico {

	public static void main(String[] args) {
		System.out.println("JOGO EDUCATIVO ARITMETICO");

		
		//Placar
		
		Conta nova;
		
		//Lista para armazenar as Contas
		List<Conta> lista = new ArrayList<Conta>();
		
		int i,stop = 1;
		
		//Scaner para Entradas
		Scanner scan = new Scanner(System.in);
		
		//Pergunta de Tempo para Resposta
		System.out.println("Digite 0 para tempo padrão ou digite tempo para cada questão: ");
		int tempo = scan.nextInt();
		if (tempo == 0)
			tempo = 30;
		System.out.println("Tempo para cada pegunta de "+tempo+" segundos\n");
		Placar contador = null;
		//Loop de Jogo
		while(stop != 0){
			//zerando contador
			contador =  new Placar();
			
			//Entrada das 10 Questoes com Interação
			for(i=0;i<10;i++){
				
				long tempoInicio = System.currentTimeMillis();
				//Código do programa...
				

				//Criando conta
				lista.add(new Conta());
				nova = lista.get(i);
				
				//printando conta
				nova.escreve();
				
				//Testando Resposta
				float entrada;
				entrada = (float) scan.nextFloat();
				//Calculando tempo
				long tempogasto;
				tempogasto = (System.currentTimeMillis()-tempoInicio)/1000;
				
				if (entrada == nova.resuldado()){
					if (tempogasto < tempo){
						contador.setCorretaDentro();
						System.out.println("RESPOSTA CORRETA DENTO DO TEMPO");
					}
					else{
						contador.setCorretaFora();
						System.out.println("RESPOSTA CORRETA FORA DO TEMPO");
					}
				}
				else{
					if (tempogasto < tempo){
						contador.setErradaDentro();
						System.out.println("RESPOSTA ERRADA DENTO DO TEMPO");
					}
					else{
						contador.setErradaFora();
						System.out.println("RESPOSTA ERRADA FORA DO TEMPO");
					}
	
				}
			}
			contador.placar();
			System.out.print("Digite 0 para Desligar ou outro numero para Continuar");
			stop = scan.nextInt();
		}
		scan.close();
	}

}
