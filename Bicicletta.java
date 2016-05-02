/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicletta;

/**
 *
 * @author svilupposw
 */
public class Bicicletta {

   String modello;
	Persona nomeProprietario;
	int marcia;
	int velocita;

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Persona getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(Persona nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public int getMarcia() {
        return marcia;
    }

    public void setMarcia(int marcia) {
        this.marcia = marcia;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void stampaStato(){
            this.nomeProprietario.stampaPersona();
	    System.out.println("Modello: "+modello+"\nnome proprietario: "+nomeProprietario+"\nvelocita: "+velocita+"\nmarcia: "+marcia);
}

    public Bicicletta(String modello, Persona nomeProprietario, int marcia, int velocita) {
        this.modello = modello;
        this.nomeProprietario = nomeProprietario;
        this.marcia = marcia;
        this.velocita = velocita;
    }
    
}
