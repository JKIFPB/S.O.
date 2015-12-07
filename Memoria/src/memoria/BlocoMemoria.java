package memoria;
 
public class BlocoMemoria {
    private Memoria [] memoria;
    private int qtd;
    private Area principal=new Area();
    private Area sobrePosicao=new Area();
   
    public BlocoMemoria(int tam, int pInicio,int pFim, int sInicio,int sFim){
        memoria = new Memoria[tam];
        qtd = tam;
        this.principal.setInicio(pInicio);
        this.principal.setFim(pFim);
        this.sobrePosicao.setInicio(sInicio);
        this.sobrePosicao.setFim(sFim);
    }
    
    public int  getPrincipalInicio(){
        return this.principal.getInicio();
    }
    public int getPrincipalFim(){
        return this.principal.getFim();
    }
    public int getSobreposicaoInicio(){
        return this.sobrePosicao.getInicio();
    }
    public int getSobreposicaoFim(){
        return this.sobrePosicao.getFim();
    }
    public void limpar (){
        for (int i = 0; i < qtd; i++){
                memoria[i].setValor(0);
        }
    }
    public void escrever (int inicio, int fim, int conteudo){
        for (int i = inicio; i <= fim; i++){
                memoria[i].setValor(conteudo);
        }
    }
    public void liberarMemoria (){
        for (int i = 0; i < qtd; i++){
            memoria[i] = null;
        }
    }
    public void  setMemoria (int i, int id){
        this.memoria[i].setValor(id);
    }
   
    public int getQuantidade(){
        return this.qtd;
    }
    public boolean  alocarProcessoSimples (Processo p){
        if (this.qtd <= p.getTamanho()){
            return false;
        }    
        for (int i =  0 ; i < p.getTamanho(); i++){
             memoria[i].setValor(p.getId()) ;		
        }
            return true;
        }   
        
    }