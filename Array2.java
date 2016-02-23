import java.util.Scanner;
// inserire da terminale quanto l array deve essere l ungo poi poi stampare il massimo numero insrerito nell array
public class Array2{

	

	public static void main (String[] args)
	{
		Scanner tastiera = new Scanner(System.in);

		System.out.println("primo valore");

			int arrayDim=tastiera.nextInt();

		

		

		double[] numbers = new double[arrayDim];

		for (int i= 0; i < numbers.length; i++)
		{
			System.out.println("inserire numeri :");
			numbers[i] = tastiera.nextDouble();
			
		}
	
}


}



