package memoria;

public class Memoria {
    private int valor;
    private Area principal;
<<<<<<< HEAD
    private Area sobrePosicao;
    public Area[] getDescricao(){  
        Area[] descricao = new Area[2];
        descricao[0]=principal;
        descricao[1]=sobrePosicao;
        return descricao;
    }
=======
    private Area sobreposicao;
    
>>>>>>> e0d1d06d05865a3cd01253e393e9c8e6c9826477
    public int getValor(){
        return this.valor;
    }
    public void setValor (int valor){
        this.valor = valor;
    }
<<<<<<< HEAD
    
=======
    public int getAreaPrincipalInicio(){
        return this.principal.getInicio();
    }
    public int getAreaPrincialFim(){
        return this.principal.getFim();
    }
>>>>>>> e0d1d06d05865a3cd01253e393e9c8e6c9826477
}
