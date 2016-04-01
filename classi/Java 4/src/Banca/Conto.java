package Banca;

public class Conto {

    public static int lastIdConto;
    public int idConto;
    protected int saldo;
    protected Persona intestatario;

    public Conto( int saldo, Persona intestatario) {
        this.idConto = Conto.lastIdConto+1;
        Conto.lastIdConto ++ ;
        this.saldo = saldo;
        this.intestatario = intestatario;
    }

    public Conto() {
    }

    public int getIdConto() {
        return idConto;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Persona getIntestatario() {
        return intestatario;
    }

    public void setIntestatario(Persona intestatario) {
        this.intestatario = intestatario;
    }

    public int deposito(int deposito){
        this.saldo += deposito;
        return this.saldo;
    }

    public int prelievo(int prelievo){

        if(prelievo > this.saldo){
            return -1;
        }

        this.saldo -= prelievo;
        return this.saldo;
    }

}
