/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.engim.mar15.beans;

import java.util.ArrayList;

/**
 *
 * @author svilupposw
 */
public class Mar09 {
    
    
    public static void main(String[] args) {
        //arraylist e un semplice array non si usano le [] 
        //perche e un array statico  
        //l array sotto e vuoto 
        
        //<String> e un tipo generico
        //(i primitivi non si possono con i generici) 
        //questo oggetto che ti passo con la get e una stringa 
       ArrayList <String> rubrica = new ArrayList<>(); 
        //con nome variabile.add posso aggiungere 
        //tutti i valori nell array che voglio 
        rubrica.add("giuseppe trz 115641");
        
        String voceInRubrica=rubrica.get(0);
            
        ArrayList<Integer> temperature=new ArrayList<>();
        temperature.add(17);
        temperature.add(15);
        temperature.add(11);
        int temp= temperature.get(0);
        
        for (int t: temperature){
             System.out.println(t);
        }
        
        ArrayList<Documento> docs =new ArrayList<>();
        docs.add(new Fattura());
        
        
        ContenitoreGenerico<Fattura> cg =new ContenitoreGenerico<>();
        cg.setContenuto(new Fattura());
       Fattura voce=cg.getContenuto();
       
       Class <? extends Documento> descrviCommessa= Commessa.class;
    }
    
}
