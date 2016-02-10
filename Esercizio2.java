import java.util.Scanner;

public class Esercizio2{
	public static void main (String [] args)
	{

			Scanner tastiera=new Scanner(System.in);

			System.out.println("quando misura la base");

			int base=tastiera.nextInt();

			System.out.println("quanto misura l altezza");

			int altezza=tastiera.nextInt();
 	
			System.out.println (2*(base+altezza)); 				
	}

}
