import EngimStore.EngimMarket;
import Ereditarieta.Bicicletta;
import Ereditarieta.BiciclettaElettrica;
import interfacce.Vendibile;

public class MainEngimStore {

    public static void main(String[] args) {

        EngimMarket market = new EngimMarket();

        Bicicletta [] biciclette = {
                new Bicicletta(50, "Caio", "Bici decente"),
                new BiciclettaElettrica(50, "Caio", "Bici decente", 20, 0),
                new Bicicletta(20, "Tizio", "Bici scassata"),
        };
        market.setSaldi(true);

        for(Bicicletta bici: biciclette){
            market.vendi(bici);
        }

        System.out.println("Incasso: "+market.getIncasso());

        market.printVenduti();
        for(Vendibile sorted : market.sort()){
            System.out.println(sorted.toString());
        }

        System.out.println("----------------------");
        System.out.println("----Massimo-----------");
        System.out.println(market.getMax());

        System.out.println("----------------------");
        System.out.println("----Minimo-----------");
        System.out.println(market.getMin());

    }
}
