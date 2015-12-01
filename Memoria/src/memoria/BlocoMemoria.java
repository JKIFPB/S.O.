
package memoria;

public class BlocoMemoria {
    private Memoria [] memoria;
    private int qtd;
    private Area principal;
    private Area sobrePosicao;
    
    public BlocoMemoria(int tam){
        memoria = new Memoria[tam]; 
        qtd = tam;
    }
    public Area[] getDescricao(){  
        Area[] descricao = new Area[2];
        descricao[0]=principal;
        descricao[1]=sobrePosicao;
        return descricao;
    }
    public void limpar (){
        for (int i = 0; i < qtd; i++){
                memoria[i].setValor( 0);
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
}
