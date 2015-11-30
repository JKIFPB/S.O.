package memoria;

public class Memoria {
    private int valor;
    private Area principal;
    private Area sobrePosicao;
    public Area[] getDescricao(){  
        Area[] descricao = new Area[2];
        descricao[0]=principal;
        descricao[1]=sobrePosicao;
        return descricao;
    }
    public int getValor(){
        return this.valor;
    }
    public void setValor (int valor){
        this.valor = valor;
    }
    
}
