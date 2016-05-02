/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engimmarket;

/**
 *
 * @author svilupposw
 */
public class EngimMarket {
        
        private int incasso;
        private int pos;
        private Vendibile[] lista;
    
        
    
    public Vendibile[] getLista() {
        return lista;
    }

    public EngimMarket() {
        this.lista = new Vendibile [10];
        this.pos=0;
    }
    
    public void addVenduto(Vendibile object){
        if(pos>=lista.length){
            System.out.println("market pieno");
        }else{
                lista[pos]=object;
                pos++;
                incasso+=object.getPrezzo();
        }
    }
   public int getIncasso(){
       
           return incasso;
    
   
        
   }

    @Override
    public String toString() {
        return "EngimMarket totale incasso: "+incasso;
    }
    public static void main(String[] args) {
        
            Vendibile[] lista = new Vendibile[4];
            
                lista[0] =new Bicicletta("BMX","Giorgio",20,3,50);
                lista[1] =new Bicicletta("Graziella","Michela",5,1,30);
                lista[2] =new Cd("il sogno eretico","Caparezza",2011,16,130);
                lista[3] =new Cd("Da solo","Vinicio Capossela",10,2008,330);
                
                
           EngimMarket   mercato =new EngimMarket();
           
           mercato.addVenduto(lista[0]);
           mercato.addVenduto(lista[1]);
           mercato.addVenduto(lista[2]);
           mercato.addVenduto(lista[3]);
          
           
           System.out.println(mercato);
          
    }
    
    
}
