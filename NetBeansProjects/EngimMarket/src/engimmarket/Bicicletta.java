/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engimmarket;

import engimmarket.Vendibile;

/**
 *
 * @author svilupposw
 */
public class Bicicletta implements Vendibile {

    String modello;
    String nomeProprietario;
    int velocita;
    int marcia;
    int numeroDiTelaio;
    int prezz;

    public int getNumeroDiTelaio() {
        return numeroDiTelaio;
    }

    public void setNumeroDiTelaio(int numeroDiTelaio) {
        this.numeroDiTelaio = numeroDiTelaio;
    }

    public Bicicletta(String modello, String nomeProprietario, int velocita, int marcia, int prezzo) {
        this.modello = modello;
        this.velocita = velocita;
        this.marcia = marcia;
        this.nomeProprietario = nomeProprietario;
        this.prezz = prezzo;
    }

    public Bicicletta(int marciaIniz, int velocitaIniz) {
        marcia = marciaIniz;
        velocita = velocitaIniz;
    }

    public String getModello() {
        return modello;
    }

    public String getNomeProrietario() {
        return nomeProprietario;
    }

    public int getMarcia() {
        return marcia;
    }

    public int getVelocita() {
        return velocita;
    }

    public int getPrezz() {
        return prezz;
    }

    public void setPrezz(int prezz) {
        this.prezz = prezz;
    }

    public void cambiaMarcia(int marcia) {
        this.marcia = marcia;
    }

    public void aumentaVelocita(int incrementoVelocita) {
        velocita += incrementoVelocita;
    }

    public void stampaStato() {
        System.out.println("Modello: " + modello + "\nnome proprietario: " + nomeProprietario + "\nvelocit�: " + velocita + "\nmarcia: " + marcia);
    }

    @Override

    public String toString() {
        return "Modello: " + modello + "\nnome proprietario: " + nomeProprietario + "\nvelocit�: " + velocita + "\nmarcia: " + marcia;
    }

    @Override
    public int getPrezzo() {
        return 100;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
