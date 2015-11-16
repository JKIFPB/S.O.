packpage memoria;

public class Processo {
	private  int tamanho;
	private  int base;
	private  int limite;
	private  int id;

	public void criar(int tamanho, int base, int limite, int id){
		this.tamanho = tamanho;
		this.base    = base;
		this.limite  = limite;
		this.id      = id;
	}
	public void apagar (){
		this.tamanho =  null;
		this.base    =  null;
		this.limite  =  null;
		this.id      =  null;
	}
}
