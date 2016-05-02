package Ereditarieta;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Created by svilupposw on 11/03/16.
 */
public class CollezioneBicilette {

    protected Bicicletta [] biciclette;

    public CollezioneBicilette( Bicicletta[] biciclette ) {
        this.biciclette = biciclette;
    }

    public ArrayList<Bicicletta> getBiciByPorprietario(String proprietario){

        ArrayList<Bicicletta> biciOfProprietario = new ArrayList<>();

        for(Bicicletta bici: this.biciclette ){
            if( bici.getProprietario().equals(proprietario) ){
                biciOfProprietario.add(bici);
            }
        }

        return biciOfProprietario;
    }

    public void getTypeOfBicicilettaByProprietario(String proprietario){

        ArrayList<Bicicletta> biciOfProprietario = this.getBiciByPorprietario(proprietario);
        for(Bicicletta bici : biciOfProprietario){
            if( bici instanceof BiciclettaElettrica){
                System.out.println(" ");
                System.out.println("---- Bicicletta Elettrica ----");
                System.out.println(bici.toString());

            }
            else{
                System.out.println(" ");
                System.out.println("---- Bicicletta ----");
                System.out.println(bici.toString());
            }
        }

    }

    @Override
    public String toString() {
        return "CollezioneBicilette{" +
                "biciclette=" + Arrays.toString(biciclette) +
                '}';
    }
}
