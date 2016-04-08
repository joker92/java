/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrafe;

import java.util.Scanner;

/**
 *
 * @author svilupposw
 */
public class ProvaCanina {
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tastiera= new Scanner(System.in);

            Padrone padroneA;
            Padrone padroneB;
            Padrone padroneC;
        
            
            
           padroneA = new Padrone("graziano","lullu","hdhdhdhdhdhdh");
           padroneB = new Padrone("luca","Mikiii","llalallala");
           padroneC = new Padrone("ale","pisc", "fdhkjdhhkjshfs");

            
           Cane caneA;
           Cane caneB;
           Cane caneC;
           
           caneA=new Cane("pluto",2,"maschio");
           caneB=new Cane("joker",3,"maschio");
           caneC=new Cane("lilly",4,"femmina");
           
           
           
          
    }   
     
           
}
