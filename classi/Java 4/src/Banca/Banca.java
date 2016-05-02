package Banca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banca {

    public static int numeroFiliale;
    protected String nome;
    protected List<Conto> listaconti;

    public Banca(String nome) {
        Banca.numeroFiliale ++;
        this.nome = nome;
        listaconti = new ArrayList<Conto>();

    }

    public void addConto(Conto conto){

        this.listaconti.add(conto);

    }

    public void removeConto(int idConto){

        this.listaconti.remove(this.getContoById(idConto));

    }

    public Conto getContoById(int id){

        Iterator<Conto> iter = listaconti.iterator();

        while( iter.hasNext() ){

            Conto current = iter.next();

            if(current.getIdConto() == id){
                return current;
            }

        }

        return null;

    }

    public void bonifico (int id1, int id2, int ammontare){

        Conto conto1 = this.getContoById(id1);
        Conto conto2 = this.getContoById(id2);

        if(conto1.prelievo(ammontare) > 0){

            conto2.deposito(ammontare);

        }


    }




}
