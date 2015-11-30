<<<<<<< HEAD

package memoria;


public class Processo {
    private int tamanho,base,limite,id;
    private Area principal;
    private AreaSobreposicao[] sobreposicao;
    private int quantidadeSobrePosicao;
=======
package memoria;

public class Processo{
    private int tamanho,base,limite,id;
    private Area Principal;
    private Area_Sobreposicao teste;
>>>>>>> e0d1d06d05865a3cd01253e393e9c8e6c9826477
    
    public Processo(int tamanho,int base, int limite, int id){
        this.tamanho	= tamanho;
        this.base	= base;
        this.limite	= limite;
        this.id		= id;
    }
<<<<<<< HEAD
    public Area[] getDescricao(int id){  
        Area[] descricao = new Area[2];
        descricao[0]=principal;
        descricao[1]=sobreposicao[id];
        return descricao;
    }
=======
>>>>>>> e0d1d06d05865a3cd01253e393e9c8e6c9826477
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
