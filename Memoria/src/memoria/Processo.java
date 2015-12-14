
package memoria;

//INICIO    = (Ms*i)
//FINAL     = (Ms*(i+1))-1

public class Processo {
    private int tamanho,base,limite,id;
    private Area principal = new Area();
    private AreaSobreposicao[] sobreposicao;
    private int quantidadeSobrePosicao;
    
    public Processo(int tamanho,int base, int limite, int id, int pInicial, int pFinal){
        this.tamanho	= tamanho;
        this.base	= base;
        this.limite	= limite;
        this.id	= id;
        this.principal.setInicio(pInicial);
        this.principal.setFim(pFinal);
  
    }
    public int getBase (){
            return this.base;
    }
    public int getLimite(){
            return this.limite;
    }
    public int getId(){
            return this.id;
    }
    public int getTamanho(){
            return this.tamanho;
    }
    public void apagarProcesso(Processo p){
        p = null;
    }
    public void criarAreaSobre(int qtdSobre){
           sobreposicao = new AreaSobreposicao[qtdSobre];
    }
    public AreaSobreposicao getAreaSobreposicao(int id){
        return this.sobreposicao[id];
    }
 
}
