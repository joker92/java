
import java.util.Scanner;
/**
 *
 * @author svilupposw
 */
public class Cd
{
        String titolo;
        String autore;
        String [] tracce;
        int anno;

        public Cd(String t,String a,String [] tr, int y)
        {
            titolo=t;
            autore=a;
            tracce=tr;
            anno=y;
        }

        public Cd(String t,String a,int y, int numTracce)
        {
            titolo=t;
            autore=a;
            anno=y;
            tracce=new String [numTracce];
            for (int i=0;i<tracce.length;i++)
                tracce[i]="Track"+(i+1);

        }

        public int trovaPosizioneCanzone(String nome)
        {
            int pos=-1;
             for (int i=0;i<tracce.length;i++)
             {
                if(tracce[i].equals(nome))
                    pos=i+1;
             }

            return pos;
        }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String[] getTracce() {
        return tracce;
    }

    public void setTracce(String[] tracce) {
        this.tracce = tracce;
    }

    public void stampaCd()
    {
        System.out.println("Autore: "+autore+"\nTitolo: "+titolo+"\nAnno di uscita: "+anno);
        System.out.println("Elenco tracce:");
        for (int i=0;i<tracce.length;i++)
            System.out.println(tracce[i]);
    }
            public static void main(String [] args)
    {
        String [] tracks = {"Il gigante e il mago","In clandestinità","Parla piano","Una giornata perfetta","Il paradisso dei calzini","Orfani ora","Sante Nicola","Vetri appannati d'America","Dall'altra parte della sera","La faccia della terra","Lettera ai soldati","Non c'è disaccordo nel cielo"};
        Cd vinicio = new Cd("Da solo","Vinicio Capossela",tracks,2008);
        Cd caparezza = new Cd("il sogno eretico","Caparezza",2011,16);
        vinicio.stampaCd();
        System.out.println("********");
        caparezza.stampaCd();
        System.out.println("posizione: "+vinicio.trovaPosizioneCanzone("Parla piano"));
        
    }
}


