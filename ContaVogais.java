package VogaisAtividade7;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ContaVogais {

	public static void main(String[] args) {
		Map<Character, Integer> dicionario = new HashMap<Character,Integer>();
		String frase = " ";
		while(frase.length() != 0){
			System.out.println("Vowel counts for the sentece: ");
			frase = JOptionPane.showInputDialog("Vowel Counts the Sentece: ");
			System.out.println("          "+frase);
			dicionario.put('a', 0);
			dicionario.put('e', 0);
			dicionario.put('i', 0);
			dicionario.put('o', 0);
			dicionario.put('u', 0);
			
			for(char c : frase.toCharArray()){
				if (c == 'a'){
					Integer count = dicionario.get('a');
					count++;
					dicionario.replace('a', count);
				}
				else if (c == 'e'){
					Integer count = dicionario.get('e');
					count++;
					dicionario.replace('e', count);
				}
				else if (c == 'i'){
					Integer count = dicionario.get('i');
					count++;
					dicionario.replace('i', count);
				}
				else if (c == 'o'){
					Integer count = dicionario.get('o');
					count++;
					dicionario.replace('o', count);
				}
				else if (c == 'u'){
					Integer count = dicionario.get('u');
					count++;
					dicionario.replace('u', count);
				}
				
			}
		if(frase.length() != 0){
			System.out.println("# of 'a': "+dicionario.get('a'));
			System.out.println("# of 'e': "+dicionario.get('e'));
			System.out.println("# of 'i': "+dicionario.get('i'));
			System.out.println("# of 'o': "+dicionario.get('o'));
			System.out.println("# of 'u': "+dicionario.get('u'));
			}
		}
		System.out.println("Programa Finalizado\n");

	}

}
