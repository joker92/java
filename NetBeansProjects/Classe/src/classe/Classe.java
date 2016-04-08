/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author svilupposw
 */
public class Classe {

    protected String nome;
     protected List<Studenti> studenti;
   

    public Classe(String nome) {
        this.nome = nome;
        studenti = new ArrayList<Studenti>();
    }

    public Classe(List<Studenti> studenti) {
        this.studenti = studenti;
    }
      public void addStudente(Studenti studente){
        this.studenti.add(studente);
    
    }
     public boolean esisteStudenti ( String  cognome ){
      Iterator<Studenti> iter = this.studenti.iterator();

        while( iter.hasNext() ){

            Studenti current = iter.next();

            if(current.getCognome().equals(cognome)){
                return true;
                
            }

        }

        return false;

      
  }
     public void removeStudente(String cognome){
        Iterator<Studenti> iter = this.studenti.iterator();

        while( iter.hasNext() ){

            Studenti current = iter.next();

            if(current.getCognome().equals(cognome)){
                iter.remove();
                
            }

        }

       
     }
     public Studenti getVecchio(){
         Iterator<Studenti> iter = this.studenti.iterator();
         
         int max = 0;
         int pos = 0;
         
        for(int i=0; i<this.studenti.size(); i++){
            if(this.studenti.get(i).getEta()>max){
                max = this.studenti.get(i).getEta();
                pos = i;
            }
            
        }
        return this.studenti.get(pos);
     }
     
    @Override
    public String toString() {
        return "Classe{" + "nome=" + nome + ", studenti=" + studenti + '}';
    }
     
   
     
  public static void main(String[] args) {
          
        Studenti studente1 = new Studenti("giuseppe", "tt",24);
        Studenti studente2 = new Studenti("dario", "genovese",21);
        Studenti studente3 = new Studenti("raffone", "17",28);
        Classe miaClasse = new Classe("ComeTiPare");
        miaClasse.addStudente(studente1);
        miaClasse.addStudente(studente2);
        miaClasse.addStudente(studente3);
       
        System.out.println(miaClasse);
        
        if(miaClasse.esisteStudenti("genovese")){
            System.out.println("Esiste genovese in classe!");
            System.out.println("*************************");
            System.out.println("lo studente viene eliminato: ");
            miaClasse.removeStudente("genovese");
        }else{
            
            System.out.println("non esiste genovese in classe!");
        
        }
        System.out.println(miaClasse);
        //studente piu vecchio
        System.out.println("+-+-+-+-+-+---+-+-+-+-+-");
        System.out.println("il piu vecchio è : "+miaClasse.getVecchio());
        
        
                

        }
     
    }
    
     
     

 