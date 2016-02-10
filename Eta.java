import java.util.Scanner;

public class Eta{
	public static void main (String [] args)
	{

			Scanner tastiera=new Scanner(System.in);

			System.out.println("quando sei nato ?");

			int nome=tastiera.nextInt();

			System.out.println("anno attuale ?");

			int born=tastiera.nextInt();

			System.out.println(born-nome); 				
	}

}
