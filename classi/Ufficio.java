
import java.util.Scanner;
/**
 *
 * @author svilupposw
 */
    public class Ufficio {
        
         Impiegato [] impiegati;
         
         
        public Ufficio(Impiegato[] impiegati) {
        this.impiegati = impiegati;
    }
        public String getNomeImpiegato(int i){
            return impiegati[i].getNome();
                   
        }
        
        public int getStipendioImpiegato(int i){
            return impiegati[i].getStipendio;
        }
        
        
        
        public void StampaUfficio(){
            
            for (int i= 0; i < impiegati.length; i++)
			System.out.println(impiegati[i].getNome() + impiegati[i].getStipendio());
        }
        
        public static void main (String[] args)
            {
                    String nome;
                    int stipendio;
                    Scanner tastiera = new Scanner(System.in);

                    System.out.println("primo valore");

                            int arrayDim=tastiera.nextInt();
                            //nei casi del duble o dei int  se dopo devo leggere una stringa devo aggiungere la stringa qui sotto   
                            tastiera.nextLine();	

                                 Impiegato[] impiegati= new Impiegato[arrayDim];

                    for (int i= 0; i < impiegati.length; i++)
                    {
                            System.out.println("inserire nome :");
                            nome = tastiera.nextLine();
                            System.out.println("inserire stipendio :");
                            stipendio=tastiera.nextInt();
                            tastiera.nextLine();
                            
                            impiegati[i]=new Impiegato(nome , stipendio);

                    }
                   


        }

 public void StampaUfficio(){
                        for(int i =0;i<imp.length;i++){
                            System.out.println(getNomeImpiegato(i) +"-"+getStipendioImpiegato(i));
                            
                                    
                                
                        
                    }
                        public int ricerca(String nome){
                            for(int i=0;i<imp.length;i++){
                                if(nome.equals(imp[i].getNome())){
                                return i;
                          
                          }
                          
                        }
				return -1;
        }
}
                        public void aumenta(int i int x){
                            imp[i].aumentaSalario(x);
                        }
                        public static void public static void main(String[] args) {
                            Scanner tastiera=new Scanner(System.in);
                            Impiegato[]arr tmp=new Impiegato("imp"+i,600);
                            arrImp[i]=tmp;
                        


                        Ufficio u =new Ufficio(arrImp);
                        u.stampaUfficio();
                        

                        int pos =u.ricerca(args[0]);

                        if (pos!=1){
                            System.out.println("impiegato presente ,aumenta stipendio...");
                            u.aumentaSalario(pos.200);
                            System.out.println("fatto");
                        }else{
                            System.out.println("non eiste un impiegato con questo nome");
                        }
                            System.out.println("nuova situazione");
        }
