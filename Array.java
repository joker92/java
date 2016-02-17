import java.util.Scanner;
//si richedono in input 5 valori numerici e si mettono in un array dopo di che si fornisce in ouput la smma dei valori presenti nel array
public class Array {

	

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		int i=0;
		double somma;

		somma=0;

		

		double[] numbers = new double[5];

		for (i = 0; i < numbers.length; i++)
		{
			System.out.println("inserire numeri :");
			numbers[i] = input.nextDouble();
		}
		for(i=0; i<=numbers.length-1; i=i+1) {
			somma= somma+numbers[i];
		}

		System.out.println("La somma vale: "+somma);
	}
}






