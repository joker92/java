import java.util.Scanner;
// esercizio che fa la media tra i numeri insercizio 
public class Esercizio3{
	public static void main (String [] args)
	{

			Scanner tastiera=new Scanner(System.in);

			System.out.println("primo numero");

			int primo=tastiera.nextInt();

			System.out.println("secondo numero ");

			int secondo=tastiera.nextInt();

			System.out.println("terzo  numero ");

			int terzo=tastiera.nextInt();
 	
			System.out.println ((primo+secondo+terzo)/3); 				
	}

}
