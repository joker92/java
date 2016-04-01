package SociEngim;

public class AssociatiEngim {

    protected SocioEngim [] soci;

    public AssociatiEngim(SocioEngim[] soci) {
        this.soci = soci;
    }

    public void printSoci(){

        for(SocioEngim socio : this.soci){
            System.out.println(socio.toString());
        }

    }

    public SocioEngim getSocioCreditoMax(){

        SocioEngim bestSocio = soci[0];

        for(SocioEngim socio: soci){
            if(socio.getPunti()> bestSocio.getPunti()){
                bestSocio = socio;
            }
        }

        return bestSocio;
    }

    public SocioEngim getSocioPuntiMensaMax(){

        SocioEngim bestSocio = soci[0];

        for(SocioEngim socio: soci){
            if( socio instanceof SocioPremium && socio.getPunti()>= bestSocio.getPunti() ){
                bestSocio = socio;
            }
        }

        return bestSocio;
    }

}
