package JogoAritimetico;

public class Placar {
	int corretaDentro;
	int corretaFora;
	int erradaDentro;
	int erradaFora;
	
	public Placar() {
		this.corretaDentro = 0;
		this.corretaFora = 0;
		this.erradaDentro = 0;
		this.erradaFora = 0;
	}
	public int getCorretaDentro() {
		return corretaDentro*10;
	}
	public void setCorretaDentro() {
		this.corretaDentro +=1;
	}
	public int getCorretaFora() {
		return corretaFora*6;
	}
	public void setCorretaFora() {
		this.corretaFora += 1;
	}
	public int getErradaDentro() {
		return erradaDentro*3;
	}
	public void setErradaDentro() {
		this.erradaDentro += 1;
	}
	public int getErradaFora() {
		return erradaFora*0;
	}
	public void setErradaFora() {
		this.erradaFora += 1;
	}
	public int total(){
		int total = 0;
		total += this.getCorretaDentro();
		total+= this.getCorretaFora();
		total+= this.getErradaDentro();
		total+= this.getErradaFora();
		return total;
	}
	public void placar(){
		System.out.format(
				"\n                  Dentro do         Fora do\n"+
				"                  Limite de Tempo   Limite de Tempo\n"+
				"Respostas Corretas      %d                 %d\n"+
				"Resposta Erradas        %d                 %d\n"
				+ 
				"---------------------------------------------------------\n "
				,corretaDentro, corretaFora,erradaDentro,erradaFora);
		System.out.format(
				" TOTAL DE PONTOS:       %d   (%d + %d + %d + %d)\n",this.total(),this.getCorretaDentro(),this.getCorretaFora(),this.getErradaDentro(),this.getErradaFora());
	}
	
}
