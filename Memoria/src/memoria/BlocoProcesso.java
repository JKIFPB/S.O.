<<<<<<< HEAD

=======
>>>>>>> e0d1d06d05865a3cd01253e393e9c8e6c9826477
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
<<<<<<< HEAD
   
=======
>>>>>>> e0d1d06d05865a3cd01253e393e9c8e6c9826477
}
