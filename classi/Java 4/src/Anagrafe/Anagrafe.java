package Anagrafe;

public class Anagrafe {

    private Coppia []listaCoppie;

    public Anagrafe(Coppia[] listaCoppie) {

        this.listaCoppie = listaCoppie;

    }

    public void printNomeCanePadrone(int I){

        if(this.listaCoppie.length >= I-1 && this.listaCoppie[I] != null){
            System.out.println(
                    this.listaCoppie[I].getPadrone().getNome()+" "+
                            this.listaCoppie[I].getCane().getNome()
            );

        }
        else {
            System.out.println("Nessun Cane/padrone in posizione "+I);
        }


    }

    public void printNomeCanePadrone(){
        for(Coppia coppia: listaCoppie){

            System.out.println( coppia.getPadrone().getNome()+" "+coppia.getCane().getNome() );
        }
    }

    public void stampaNomeCompletoCani(){
        for(Coppia coppia: listaCoppie){
            System.out.println( coppia.getPadrone().getCognome()+" "+coppia.getCane().getNome() );
        }
    }

    public String getNomePadroneDiCane(int idCane){
        for(Coppia coppia: listaCoppie){
            return coppia.getPadrone().getNome();
        }
        return "Questo cane non ha nessun padrone";
    }

    public int contaNumeroCaniConPadrone(String nomePadrone){
        int counter = 0;
        for(Coppia coppia: listaCoppie){
            if(coppia.getPadrone().getNome().equals(nomePadrone)){
                counter ++;
            }
        }
        return counter;
    }

    public String [] getNomiCaniConPadrone(String nomePadrone){

        String [] nomiCani = new String[ this.contaNumeroCaniConPadrone(nomePadrone) ];

        int counter = 0;
        for(Coppia coppia: listaCoppie){
            if(coppia.getPadrone().getNome().equals(nomePadrone)){
                nomiCani[counter] = coppia.getCane().getNome();
                counter ++;
            }
        }
        return nomiCani;

    }

}
