package Telefone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefone {

	public static void main(String[] args) throws FileNotFoundException {
		//Dicionario das letras
		File arquivoSaida = new File("texto.txt");
		FileOutputStream arquivoSaidaMedia = new FileOutputStream(arquivoSaida);
		PrintWriter saidaMedia = new PrintWriter(arquivoSaidaMedia);
		Map<Character, String> numeros = new HashMap<Character, String>();
		numeros.put('2', "abc");
		numeros.put('3', "def");
		numeros.put('4', "ghi");
		numeros.put('5', "jkl");
		numeros.put('6', "mno");
		numeros.put('7', "pqr");
		numeros.put('8', "stu");
		numeros.put('9', "vxz");
		//Entrada
		Scanner scan = new Scanner(System.in);
		String entrada;
		System.out.print("Insira um Numero de 7 Digitos que NAO CONTENHA 0 e 1: ");
		entrada = scan.next();
		ArrayList<Character> lista = new ArrayList<Character>();
		for(char c : entrada.toCharArray()){
			lista.add(c);	
		}
		System.out.println("Numero: "+lista);
		int count = 1;
		for (char c0 : numeros.get(lista.get(0)).toCharArray()){
			for (char c1 : numeros.get(lista.get(1)).toCharArray()){
				for (char c2 : numeros.get(lista.get(2)).toCharArray()){
					for (char c3 : numeros.get(lista.get(3)).toCharArray()){
						for (char c4 : numeros.get(lista.get(4)).toCharArray()){
							for (char c5 : numeros.get(lista.get(5)).toCharArray()){
								for (char c6 : numeros.get(lista.get(6)).toCharArray()){
									saidaMedia.print(c0);
									saidaMedia.print(c1);
									saidaMedia.print(c2);
									saidaMedia.print(c3);
									saidaMedia.print(c4);
									saidaMedia.print(c5);
									saidaMedia.println(c6);
									
									System.out.print(count+": "+c0);
									System.out.print(c1);
									System.out.print(c2);
									System.out.print(c3);
									System.out.print(c4);
									System.out.print(c5);
									System.out.println(c6);
									count++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Arquivo texto.txt Salvo com Sucesso!");
		saidaMedia.close();
		scan.close();
	}
}
