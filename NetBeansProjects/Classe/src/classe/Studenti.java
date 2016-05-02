
package classe;

import java.util.ArrayList;
import java.util.Iterator;

class Studenti {

    static Iterator<Studenti> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    protected String nome;
    protected String cognome;
    protected int eta;

    public Studenti() {
        
    }

    public Studenti(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
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

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Studenti{\n" + "nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + '}';
    }
  
}

