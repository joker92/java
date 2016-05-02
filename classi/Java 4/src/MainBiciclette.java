import Ereditarieta.*;

/**
 * Created by svilupposw on 10/03/16.
 */
public class MainBiciclette {
    public static void main(String[] args) {

        Bicicletta [] bici = {
                new Bicicletta("bici scassata", "Tizio",  10),
                new Bicicletta ("bici bella", "Caio",  15),
                new BiciclettaElettrica( "Bici molto bella", "Tizio", 10, 30, 2)
        };

        CollezioneBicilette biciclette = new CollezioneBicilette(bici);

        biciclette.getTypeOfBicicilettaByProprietario("Tizio");

    }
}
