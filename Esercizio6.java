import java.util.Scanner;
//si richiedono 3 valori e per l ultimo maggiore e verichica se si tratta di una terna pitagorica
public class Esercizio6{
	public static void main (String [] args)
	{

			Scanner tastiera=new Scanner(System.in);

			System.out.println("primo numero");

			int primo=tastiera.nextInt();

			System.out.println("secondo numero ");

			int secondo=tastiera.nextInt();

			System.out.println("terzo  numero ");

			int terzo=tastiera.nextInt();
 	
		if(primo*primo+secondo*secondo==terzo*terzo){
			System.out.println(" e una terna pitagorica");
		}else{
			System.out.println("non e una terna pitagorica ");
		}
	}

}
