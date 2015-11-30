
<<<<<<< HEAD
package memoria;

=======
>>>>>>> e0d1d06d05865a3cd01253e393e9c8e6c9826477
public class BlocoMemoria {
    private Memoria [] memoria;
    private int qtd;
    public BlocoMemoria(int tam){
        memoria = new Memoria[tam]; 
        qtd = tam;
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
<<<<<<< HEAD
    public Area[] getDescricao(int i){
        return memoria[i].getDescricao();
    }
=======
>>>>>>> e0d1d06d05865a3cd01253e393e9c8e6c9826477
    public int getQuantidade(){
        return this.qtd;
    } 
}
