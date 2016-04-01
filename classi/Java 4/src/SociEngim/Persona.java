package SociEngim;

public class Persona {

    protected String nome;
    protected String cognome;
    protected int annoNascita;


    public Persona(String nome, String cognome, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    @Override
    public String toString() {

        String out = "------------------------------------\n";
        out += "\n";
        out += "Socio: "+this.nome+" "+this.cognome+" - Data di nascita "+this.annoNascita+"\n";

        return out;
    }
}
