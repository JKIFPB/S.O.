package memoria;

public class Memoria {
    private int valor;
    private Area principal;
    private Area sobreposicao;
    
    public int getValor(){
        return this.valor;
    }
    public void setValor (int valor){
        this.valor = valor;
    }
    public int getAreaPrincipalInicio(){
        return this.principal.getInicio();
    }
    public int getAreaPrincialFim(){
        return this.principal.getFim();
    }
}
