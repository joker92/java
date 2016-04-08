package engimsoci;

public class Persona{
    
    protected String nome;
    protected String cognome;
    protected int annoDinascita;

    public Persona(String nome,String cognome,
                 int annoDinascita ){
        this.nome=nome;
        this.cognome=cognome;
        this.annoDinascita=annoDinascita;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public String toString(){

    	return "Nome:"+nome+" Cognome:"+cognome+" anno:"+annoDinascita;

    }


}