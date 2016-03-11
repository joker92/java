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
public class BiciElettrica extends Bicicletta{
    int durataBatteria;
    int potenza;
            
    public BiciElettrica(String modello, String nomeProprietario, int velocita, int marcia,int durataBatteria,int potenza) {
        super(modello, nomeProprietario, velocita, marcia);
        
        this.durataBatteria = durataBatteria;
        this.potenza = potenza;
        
    }

    public int getDurataBatteria() {
        return durataBatteria;
    }

    public void setDurataBatteria(int durataBatteria) {
        this.durataBatteria = durataBatteria;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    @Override
    public void stampaStato() {
        super.stampaStato(); 
            System.out.println("batteria: "+this.durataBatteria);
            System.out.println("potenza: "+this.potenza);
    }

     @Override
     public String toString(){
     return super.toString()+"Batteria: "+this.getDurataBatteria()+"potenza: "+this.getPotenza();
     
     }  
}
