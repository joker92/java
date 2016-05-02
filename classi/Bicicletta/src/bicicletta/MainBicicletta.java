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
public class MainBicicletta {
    
    
    
     public static void mainvechhio(String[] arg){
               Bicicletta biciA , biciB;
               
               biciA=new Bicicletta("graziella","michele",1,2);
               biciB=new BiciElettrica("tandem","rocco",2,4,30,20);
               
               biciA.stampaStato();
               biciB.stampaStato();
               System.out.println("------Override toString--------");
               System.out.println(biciA);
               System.out.println("------Bici B--------");
               System.out.println(biciB);
           }
}


