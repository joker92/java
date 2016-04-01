package Anagrafe;

import java.util.ArrayList;

/**
 * Created by svilupposw on 10/03/16.
 */

public class Gara {

    public ArrayList<Coppia > concorrenti = new ArrayList<>();
    public int numeroConcorrenti;

    public Gara(int numeroConcorrenti) {
        this.numeroConcorrenti = 0;
    }

    boolean addInClassifica(int idCane){

        for(Coppia coppia : concorrenti){
            if(coppia.getCane().getId() == idCane ){
                return false;
            }
        }

        return true;
    }

}
