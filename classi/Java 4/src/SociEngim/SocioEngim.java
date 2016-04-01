package SociEngim;

public class SocioEngim extends Persona {

    protected int punti = 0;
    protected int oreLezione = 0;
    protected int puntiOreLezione = 5;
    protected int numeroTessera;
    protected static int ultimoNumeroTessera;

    public SocioEngim(String nome, String cognome, int annoNascita) {
        super(nome, cognome, annoNascita);

        SocioEngim.ultimoNumeroTessera += 1;
        this.numeroTessera = SocioEngim.ultimoNumeroTessera;

    }

    public void addOreLezione(int add){
        this.oreLezione += add;
        this.refreshPunti();
    }

    protected void refreshPunti(){
        this.punti = this.oreLezione*this.puntiOreLezione;
    }

    public int getNumeroTessera() {
        return numeroTessera;
    }

    public int getPunti() {
        return punti;
    }

    public int getOreLezione() {
        return oreLezione;
    }

    @Override
    public String toString() {
        String out = super.toString();
        out += "Punti: "+this.punti+" - Ore di Lezione: "+this.oreLezione+" - Tessera:"+this.numeroTessera+"\n";
        return out;
    }

}
