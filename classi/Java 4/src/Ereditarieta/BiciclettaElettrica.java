package Ereditarieta;

import interfacce.Scontabile;

public class BiciclettaElettrica extends Bicicletta implements Scontabile {

    protected int durataBatteria;
    protected int potenzaBatteria;
    protected int sconto;

    public BiciclettaElettrica(String marca, String proprietario, int velocita, int durataBatteria, int potenzaBatteria) {
        super(marca, proprietario, velocita);
        this.durataBatteria = durataBatteria;
        this.potenzaBatteria = potenzaBatteria;
    }

    public BiciclettaElettrica(int prezzo, String proprietario, String marca, int durataBatteria, int potenzaBatteria) {
        super(prezzo, proprietario, marca);
        this.durataBatteria = durataBatteria;
        this.potenzaBatteria = potenzaBatteria;
        this.sconto = 20;
    }

    public int getDurataBatteria() {
        return durataBatteria;
    }

    public void setDurataBatteria(int durataBatteria) {
        this.durataBatteria = durataBatteria;
    }

    public int getPotenzaBatteria() {
        return potenzaBatteria;
    }

    public void setPotenzaBatteria(int potenzaBatteria) {
        this.potenzaBatteria = potenzaBatteria;
    }

    @Override
    public void stampaStato() {
        super.stampaStato();
        System.out.println("Batteria: "+this.durataBatteria);
        System.out.println("Potenza: "+this.potenzaBatteria);

    }

    @Override
    public String toString() {
        return super.toString()+", BiciclettaElettrica{" +
                "durataBatteria=" + durataBatteria +
                ", potenzaBatteria=" + potenzaBatteria +
                '}';
    }

    @Override
    public int getPrezzoScontato() {
        return (this.prezzo*this.sconto)/100;

    }
}
