package RomanoAtividade2;

import java.util.Scanner;

public class RomanoPrincipal {

	public static void main(String[] args) {
		String romano = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira o Valor para ser convertido em Romano: ");
		int entrada = scan.nextInt();
		while(entrada > 0){
			if (entrada >= 1000){
				romano += "M";
				entrada -= 1000;
			}
			else if (entrada >= 900){
				romano += "CM";
				entrada -= 900;
			}
			else if (entrada >= 500){
				romano += "D";
				entrada -= 500;
			}
			else if (entrada >= 400){
				romano += "CD";
				entrada -= 400;
			}
			else if (entrada >= 100){
				romano += "C";
				entrada -= 100;
			}
			else if (entrada >= 90){
				romano += "XC";
				entrada -= 90;
			}
			else if (entrada >= 50){
				romano += "L";
				entrada -= 50;
			}
			else if (entrada >= 40){
				romano += "XL";
				entrada -= 40;
			}
			else if (entrada >= 10){
				romano += "X";
				entrada -= 10;
			}
			else if (entrada >= 9){
				romano += "IX";
				entrada -= 9;
			}
			else if (entrada >= 5){
				romano += "V";
				entrada -= 5;
			}
			else if (entrada >= 4){
				romano += "IV";
				entrada -= 4;
			}
			else{
				romano += "I";
				entrada -= 1;
			}
			
		}
		System.out.println(romano);
		scan.close();
		
	}

}
