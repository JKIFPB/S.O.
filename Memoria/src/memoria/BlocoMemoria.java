package memoria;


public class BlocoMemoria {
    private Memoria[] memoria;
    private int qtd;
    public void criar (int tam){
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

}
