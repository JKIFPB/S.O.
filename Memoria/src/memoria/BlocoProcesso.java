package memoria;

public class BlocoProcesso {
    public boolean escreverProcesso (BlocoMemoria memoria, Processo processo, int posicaoInicial){
        if (memoria.getQuantidade() >= processo.getTamanho()){
            for (int i =  posicaoInicial ; i < processo.getTamanho(); i++){
                memoria.setMemoria(i,processo.getId());		
            }
            return true;
        }    
        return false;
    }
}
