public class BlocoProcesso {
	escreverProcesso (BlocoMemoria memoria, Processo processo, int posicaoInicial){
		for (int i =  posicaoInicial + processo.getBase() ; i < posicaoInicial + processo.getBase() + processo.getTamanho(); i++){
			memoria[i] = processo.getId();		
		}
}
