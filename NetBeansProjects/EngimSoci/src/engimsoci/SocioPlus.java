/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engimsoci;

public class SocioPlus extends SocioEngim{
     protected String mail;

     public SocioPlus(String nome,String cognome,
                 int annoDinascita, String mail ){
          super(nome,cognome,annoDinascita);
          this.mail=mail;
     }

    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    
    // @ovveride
    public void addOreLezione(int numOre){
        this.crediti += numOre * 10;
    }
    
    

 /*
    public void addOreLezione(int numOre){
        super.addOreLezione(numOre*2);
    }*/

   public String toString(){
        String toRet=super.toString();
        toRet =toRet+ " Mail:"+mail;
        return toRet;
    }
}