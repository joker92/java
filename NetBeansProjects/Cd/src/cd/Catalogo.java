/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd;

/**
 *
 * @author svilupposw
 */
public class Catalogo  {
       Cd [] collezione;
        String nomeCatalogo;

        public Catalogo(String titolo,Cd [] c)
        {
            collezione=c;
            nomeCatalogo=titolo;
        }

        public int cercaCdPerAutore(String autore)
        {
            int numCd=0;
            for (int i=0;i<collezione.length;i++)
                {
                    if(autore.equals(collezione[i].getAutore()))
                        numCd++;
                }
            return numCd;
        }

        public int cercaCdPerAnno(int anno)
        {
            int numCd=0;
            for (int i=0;i<collezione.length;i++)
                {
                    if(anno==collezione[i].getAnno())
                        numCd++;
                }
            return numCd;
        }

        public Cd cercaCdPerTitolo(String titolo)
        {
            Cd toRet=null;
            for (int i=0;i<collezione.length;i++)
                if(titolo.equals(collezione[i].getTitolo()))
                    toRet=collezione[i];

            return toRet;
        }
        
        public Cd [] trovaCdDiAutore(String autore)
        {
            int dim=cercaCdPerAutore(autore);
            Cd [] toRet=new Cd[dim];
            int j=0;
            
                for (int i=0;i<collezione.length;i++)
                {
                    if(autore.equals(collezione[i].getAutore()))
                        {
                        toRet[j]=collezione[i];
                        j++;
                        }
                }
            
            return toRet;
            
        }

        public void stampaCatalogo()
        {
            System.out.println("Nome catalogo: "+nomeCatalogo);
            System.out.println("Elenco CD:");
            for (int i=0;i<collezione.length;i++)
                collezione[i].stampaCd();
            

        }

    public Cd[] getCollezione() {
        return collezione;
    }

    public void setCollezione(Cd[] collezione) {
        this.collezione = collezione;
    }

    public String getNomeCatalogo() {
        return nomeCatalogo;
    }

    public void setNomeCatalogo(String nomeCatalogo) {
        this.nomeCatalogo = nomeCatalogo;
    }
          public static void main(String [] args)
	{
        String [] tracks = {"Il gigante e il mago","In clandestinità","Parla piano","Una giornata perfetta","Il paradisso dei calzini","Orfani ora","Sante Nicola","Vetri appannati d'America","Dall'altra parte della sera","La faccia della terra","Lettera ai soldati","Non c'è disaccordo nel cielo"};
        Cd vinicio = new Cd("Da solo","Vinicio Capossela",tracks,2008);
        Cd caparezza = new Cd("il sogno eretico","Caparezza",2011,16);
        Cd caparezza2 = new Cd("Habemus Capa","Caparezza",2006,19);
        Cd gogol = new Cd("Trans-Continental Hustle","Gogol Bordello",2011,13);
        Cd [] c = {vinicio,caparezza,gogol,caparezza2};
        Catalogo catalogo = new Catalogo("catalogo di Michele",c);
        catalogo.stampaCatalogo();
        System.out.println("********");
        System.out.println("Numero cd di Caparezza: "+catalogo.cercaCdPerAutore("Caparezza"));
        System.out.println("********");
        System.out.println("Numero cd del 2011: "+catalogo.cercaCdPerAnno(2011));
        System.out.println("********");
        catalogo.cercaCdPerTitolo("Da solo").stampaCd();
        System.out.println("********");
        Cd [] cdTrovati=catalogo.trovaCdDiAutore("Caparezza");
        System.out.println("Cd di caparezza: ");
        for (int i=0;i<cdTrovati.length;i++)
            cdTrovati[i].stampaCd();



    }
}
