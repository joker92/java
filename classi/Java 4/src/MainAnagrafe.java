import Anagrafe.*;

public class MainAnagrafe {

    public  static void main(String[] args){

        Cane cane1 = new Cane("Doggie", "m", 1 );
        Cane cane2 = new Cane("Alina", "f",  2);
        Cane cane3 = new Cane("Anubi", "m",  10000);

        Padrone padrone1 = new Padrone("Tizio", "Caio", "tzce23rty");
        Padrone padrone2 = new Padrone("Sempronio", "Caio", "smprc23rty");

        Coppia [] coppie = {
                new Coppia(cane1, padrone1),
                new Coppia(cane2, padrone1),
                new Coppia(cane3, padrone2)
        };

        Anagrafe anagrafe = new Anagrafe(coppie);

        /*Test*/
        // Stampa tuttele coppie
        anagrafe.printNomeCanePadrone();
        // Stampa coppia in posizione X
        anagrafe.printNomeCanePadrone(0);
        anagrafe.printNomeCanePadrone(10);
        // Stampa tutti i cani di un padrone
        for(String cane : anagrafe.getNomiCaniConPadrone("Tizio")){
            System.out.println(cane);
        }


    }

}