import java.util.Scanner;
//si richeidono 3 valori e fornisce in ouptut e  stampa il maggiore 
public class Esercizio5{
	public static void main (String [] args)
	{

			Scanner tastiera=new Scanner(System.in);

			System.out.println("primo numero");

			int primo=tastiera.nextInt();

			System.out.println("secondo numero ");

			int secondo=tastiera.nextInt();

			System.out.println("terzo  numero ");

			int terzo=tastiera.nextInt();
 	
		if(primo>secondo&&primo>terzo){
			System.out.println(primo);
		}else if(secondo>primo&&secondo>terzo){
			System.out.println(secondo);
		}else { 
			System.out.println(terzo);
		}			
	}

}
