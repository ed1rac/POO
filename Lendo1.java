package final2016;

import java.io.*;

public class Lendo1 {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("integers.dat");
		InputStream inStream = new FileInputStream(arquivo);
		InputStreamReader isr = new InputStreamReader(inStream);
		int i;
		int maior=0, menor=100, total=0;
		for (i=0;i<10;i++){
			int c = isr.read();
			if (c > maior)
				maior = c;
			if (c < menor)
				menor = c;
			total+=c;
		}
		total = total/10;
		System.out.println("maior: "+maior+"menor: "+ menor+" media: "+ total);
		
		
		isr.close();
	}

}
