import Province.Regione;

import java.util.ArrayList;

/**
 * Created by svilupposw on 23/03/16.
 */
public class MainRegione {

    public static void main(String[] args) {

        Regione regione1 = new Regione(1);
        ArrayList<String> province = regione1.getNomiProvince();

        for ( String provincia: province) {
            System.out.println(provincia);

        }
    }

}
