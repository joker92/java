/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.beppe;

/**
 *
 * @author svilupposw
 */
public class Alga extends Arbusto {
   private  String mare ;

    public String getMare() {
        return mare;
    }

    public void setMare(String mare) {
        this.mare = mare;
    }
    
    
    public void stampa(){
                 String frase ="L'alga" + getNome()+", che ha alt.media di "
                                  +getAltezzaMedia();
         System.out.println(frase);
}
}
