/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engimsoci;

public class SocioPremium extends SocioPlus{

    protected int puntiMensa;

    public SocioPremium(String nome,String cognome,
        int annoDinascita, String mail, int puntiMensa){
        super(nome,cognome,annoDinascita,mail);
        this.puntiMensa=puntiMensa;
    }

    public int getPuntiMensa(){
        return puntiMensa;
    }
    public void setPuntiMensa(int puntiMensa){
        this.puntiMensa=puntiMensa;
    }
    
    public void addOreLezione(int numOre){
        super.addOreLezione(numOre);
        this.puntiMensa+=numOre;
    }
    public String toString(){
        String toRet=super.toString();
        toRet =toRet+ " puntiMensa:"+puntiMensa;
        return toRet;
    }
}