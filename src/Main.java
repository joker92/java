
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author svilupposw
 */
public class Main {
    public static void main (String[] args){
        Dipendente paperino=new Dipendente();
        paperino.setNome("Paolino");
        paperino.setCognome("Paperino");
        paperino.setDataAssunzione(new Date());
        
        stampaNome(paperino);
      
        
        Consulente topolino=new Consulente();
        paperino.setNome("Paolino");
        paperino.setCognome("Paperino");
        topolino.setCostoOrario(5);
        topolino.setAreaCompetenza("formaggio");
        topolino.setPartitaIva("11231256454");



    }
}
