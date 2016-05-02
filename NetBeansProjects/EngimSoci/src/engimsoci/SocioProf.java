/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engimsoci;
public class SocioProf extends SocioEngim{
    
    protected String indirizzo;

    public SocioProf(String nome,String cognome,
                 int annoDinascita, String indirizzo){
        super(nome,cognome,annoDinascita);
        this.indirizzo=indirizzo;
    }


   public String toString(){
        String toRet=super.toString();
        toRet =toRet+ " indirizzo:"+indirizzo;
        return toRet;
    }

}