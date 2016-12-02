package JogoAritimetico;

import java.util.Random;

public class Conta {
	static String expo[] = {"+","-","/","*"};
	Random random = new Random();
	int iexpo = random.nextInt(4);
	
	float a = random.nextInt(10);
	float b = random.nextInt(10);
	
	public void escreve(){
		System.out.print(a + expo[iexpo] + b+" = : ");
	}
	
	public float resuldado(){
		float x = 0;
		if (iexpo == 0){
			x = a + b;
			return x;
		}
		if (iexpo == 1){
			x = a - b;
			return x;
		}
		if (iexpo == 2){
			x = a / b;
			return x;
		}
		if (iexpo == 3){
			x = a * b;
			return x;
		}
		return 0;
	}
	
	
}
