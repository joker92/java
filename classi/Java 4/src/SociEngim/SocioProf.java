package SociEngim;

public class SocioProf extends SocioPremium{

    protected String indirizzoPostale;

    public SocioProf(String nome, String cognome, int annoNascita, String email, String indirizzoPostale) {
        super(nome, cognome, annoNascita, email);
        this.indirizzoPostale = indirizzoPostale;
    }

    public String getIndirizzoPostale() {
        return indirizzoPostale;
    }

    @Override
    public String toString() {
        String out = super.toString();
        out += "Indirizzo Regali: "+this.indirizzoPostale+"\n";
        return out;
    }
}
