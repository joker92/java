import SociEngim.*;

public class MainSociEngim {

    public static void main(String[] args) {

        SocioEngim[] soci = {
                new SocioEngim("Tizio", "Caio", 1980),
                new SocioEngim("Sempronio", "Caio", 1984 ),
                new SocioPlus("Seneca", "boh", 1980, "seneca@gmail.com"),
                new SocioPlus("Stocazzo", "boh", 1980, "stocazzo@gmail.com"),
                new SocioPremium("Giulio", "Cesare", 1986, "giulio@gmail.com"),
                new SocioPremium("Caio", "Plinio", 1988, "caio@gmail.com")
        };

        for(SocioEngim socio : soci){
            socio.addOreLezione( (int)(Math.random()*10) );
        }

        AssociatiEngim associatiEngim = new AssociatiEngim(soci);
        associatiEngim.printSoci();

        System.out.println( "Miglior Socio: "+associatiEngim.getSocioCreditoMax().getNome());
        System.out.println( "Miglior Socio mensa: "+associatiEngim.getSocioPuntiMensaMax().getNome());

    }

}