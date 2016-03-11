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
public class CollezioineBici {
        
         Bicicletta [] collezione;
        
         
         
    public CollezioineBici(Bicicletta[] collezione) {
        this.collezione = collezione;
       
    }

    public Bicicletta[] getCollezione() {
        return collezione;
    }

    public void setCollezione(Bicicletta[] collezione) {
        this.collezione = collezione;
    }
        
    public void tipoBiciDaNomeProprietario(String prop){
        
                for(int i=0;i<this.collezione.length;i++){
                    if(this.collezione[i].getNomeProrietario().equals(prop)){
                       if(this.collezione[i].getClass()==BiciElettrica.class){
                            System.out.println("la bici di "+this.collezione[i].getNomeProrietario()+ " è una bici elettrica");
                       }else{
                       
                                System.out.println("la bici di "+this.collezione[i].getNomeProrietario()+ " non è una bici elettrica");   
                           }
                    }
                }
                    
    }

    @Override
    public String toString() {
        return Bicicletta.class.toString();
    }
    
                
     public static void main(String[] arg){
         
         Bicicletta biciA ,biciB,biciC,biciD,biciE,biciF;
         
         biciA=new Bicicletta("graziella","michele",1,2);
         biciB=new BiciElettrica("tandem","rocco",2,4,30,20);
         biciC=new Bicicletta("x","pino",6,30);
         biciD=new BiciElettrica("vt","ciao",5,7,30,90);
         biciE=new Bicicletta("sx","pluto",8,10);
         biciF=new BiciElettrica("cacca","ssst",8,2,40,100);
         
     
         Bicicletta [] collezione={biciA ,biciB,biciC,biciD,biciE,biciF};
         
         
         CollezioineBici c=new CollezioineBici(collezione);
         
         
         c.tipoBiciDaNomeProprietario("pino");
         System.out.println(biciD.getNomeProrietario());
         
        System.out.println( c.toString());
            for(int i=0;i<collezione.length;i++){
                System.out.println("-----to string----");
               System.out.println(collezione[i]);
            }
     }
}
