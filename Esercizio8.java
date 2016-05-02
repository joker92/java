import java.util.Scanner;
//esercizio che richiedono 2 valori interni controlla che il primo sia ingeriore al secondo altrimenti richiede il secondo valore dandoti i numeri primi 
public class Esercizio8{
	public static void main (String [] args)
	{

			Scanner tastiera=new Scanner(System.in);

			System.out.println("primo valore");

			int primo=tastiera.nextInt();

			System.out.println("secondo valore ");

			int secondo=tastiera.nextInt();

			if(primo<secondo){
						for(int i=primo;i<secondo;i++){
							System.out.println("count is:"+i);
	}
			}else{
				System.out.println("secondo valore errato inserisci nuovo valore ");

						 secondo=tastiera.nextInt();

						 		for(int i=primo;i<secondo;i++){
									System.out.println("count is:"+i);
	}
			}

		
	}

}
