package SociEngim;

public class SocioPlus extends SocioEngim{

    protected String email;

    public SocioPlus(String nome, String cognome, int annoNascita, String email) {
        super(nome, cognome, annoNascita);
        this.email = email;
        this.puntiOreLezione = 10;
    }

    @Override
    public String toString() {
        String out = super.toString();
        out += "Email: "+this.email+"\n";
        return out;
    }

}
