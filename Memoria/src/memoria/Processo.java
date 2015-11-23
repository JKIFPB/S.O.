package memoria;

public class Processo{
    private int tamanho,base,limite,id;
    private Area Principal;
    private Area_Sobreposicao teste;
    
    public Processo(int tamanho,int base, int limite, int id){
        this.tamanho	= tamanho;
        this.base	= base;
        this.limite	= limite;
        this.id		= id;
    }
    public int getBase (){
            return this.base;
    }
    public int getLimite(){
            return this.limite;
    }
    public int getId(){
            return this.id;
    }
    public int getTamanho(){
            return this.tamanho;
    }
}
