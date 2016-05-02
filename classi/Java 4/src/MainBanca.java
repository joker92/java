import Banca.*;

public class MainBanca {

//    BANCA - Implementare con ArrayList
//

//    Una Persona ha:

//      nome
//      cognome
//      codiceFiscale
//

//    Un ContoCorrente ha:

//      - idConto
//      - un intestatario (una Persona)
//      - un saldo
//

//    Una Banca ha:

//      un nome,
//      un numero di filiale,
//      una lista di oggetti ContoCorrente.
//

//    La Banca offre i seguenti metodi:

//      void addContoCorrente(ContoCorrente).
//      boolean removeContoCorrente(idConto).
//      ContoCorrente getContoCorrente(codiceFiscalePersona).
//      faiDeposito(idConto, ammontare)
//            [Creare un metodo faiDeposito(ammontare) in ContoCorrente]
//      faiPrelievo(idConto, ammontare)
//            [Creare un metodo faiPrelievo(ammontare) in ContoCorrente]
//      faiBonifico(idConto1, idConto2, ammontare)

    public static void main(String[] args) {

        Persona tizio = new Persona("Tizio", "Caio", "tzciunmo");
        Persona sempronio = new Persona("Sempronio", "Caio", "snpcimo");

        Conto conto1 = new Conto(1000, tizio);
        Conto conto2 = new Conto(1000, sempronio);


        Banca banca = new Banca("La mia banca bellissima");

        banca.addConto(conto1);
        banca.addConto(conto2);

        banca.bonifico(conto1.getIdConto(), conto2.getIdConto(), 500);

        System.out.println( "Conto1: "+conto1.getSaldo() );
        System.out.println( "Conto2: "+conto2.getSaldo() );

    }

}
