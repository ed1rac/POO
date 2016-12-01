package final2016;

import java.io.*;
import java.util.Random;

public class Escrevendo1 {

	public static void main(String[] args) throws IOException {
		File arquivo = new File("integers.dat");
		OutputStream outStream = new FileOutputStream(arquivo);
		OutputStreamWriter arquivoEscritor = new OutputStreamWriter(outStream);
		BufferedWriter bw = new BufferedWriter(arquivoEscritor);
		int i;
		Random gerador = new Random();
		int x;
		for ( i = 0; i<10; i++ ){
			x = gerador.nextInt(100);
			bw.write(x);
		}
		bw.close();
	}

}
