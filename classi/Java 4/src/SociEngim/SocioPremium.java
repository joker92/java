package SociEngim;

public class SocioPremium extends SocioPlus {

    protected int puntiDistibutore = 0;
    protected int puntiMensa = 0;

    public SocioPremium(String nome, String cognome, int annoNascita, String email) {
        super(nome, cognome, annoNascita, email);
    }

    @Override
    protected void refreshPunti() {
        super.refreshPunti();
        this.puntiMensa = this.oreLezione;
    }

    public int getPuntiDistibutore() {
        return puntiDistibutore;
    }

    public int getPuntiMensa() {
        return puntiMensa;
    }

    public void addPuntiDistributore(int add){
        this.puntiDistibutore += add;
    }

    public void subtractPuntiDistributore(int sub){
        this.puntiDistibutore -= sub;
    }

    @Override
    public String toString() {
        String out = super.toString();
        out += "Punti mensa: "+this.puntiMensa+" - Punti distributore: "+this.puntiDistibutore+"\n";
        return out;
    }
}
