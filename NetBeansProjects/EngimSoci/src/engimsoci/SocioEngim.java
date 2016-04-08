/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engimsoci;

public class SocioEngim extends Persona{
     static int contatore=0;

     static final int NUM_CREDITI_PER_ORA=5;

     protected int numTessera;
     protected int crediti;

     public SocioEngim(String nome,String cognome,
                 int annoDinascita ){
          super(nome,cognome,annoDinascita);
          this.numTessera=++contatore;
          this.crediti=0;
     }

    public int getNumTessera(){
        return numTessera;
    }
    public int getCrediti(){
        return crediti;
    }

    public void addOreLezione(int numOre){
        this.crediti += numOre * NUM_CREDITI_PER_ORA;
    }
    public void addLezioneStandard(){
        addOreLezione(4);
    }

    public String toString(){
        String toRet=super.toString();
        toRet =toRet+ " Num tessera:"+numTessera+
             " Crediti:"+crediti;
        return toRet;
    }
   
}