/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impiegato;

import java.util.Scanner;

/**
 *
 * @author svilupposw
 */
public class ufficio {

    Impiegato[] impiegati;

    public ufficio(Impiegato[] impiegati) {
        this.impiegati = impiegati;
    }

    public String getNomeImpiegato(int i) {
        return impiegati[i].getNome();

    }

    public int getStipendioImpiegato(int i) {
        return impiegati[i].getStipendio;
    }

    public void StampaUfficio() {

        for (int i = 0; i < impiegati.length; i++) {
            System.out.println(impiegati[i].getNome() + impiegati[i].getStipendio());
        }
    }

    public static void main(String[] args) {
        String nome;
        int stipendio;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("primo valore");

        int arrayDim = tastiera.nextInt();

        Impiegato[] impiegati = new Impiegato[arrayDim];

        for (int i = 0; i < impiegati.length; i++) {
            System.out.println("inserire nome :");
            nome = tastiera.nextLine();
            stipendio = tastiera.nextInt();
            tastiera.nextLine();

            impiegati[i] = new Impiegato(nome, stipendio);

        }

    }

}
