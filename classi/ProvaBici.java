
import java.util.Scanner;



public class ProvaBici{

	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		int velocita;

		Bicicletta biciA;
		Bicicletta biciB;
		Bicicletta biciC;


		biciA=new Bicicletta("bmx",2);
		biciB=new Bicicletta("graziella",1);
		biciC=new Bicicletta("montambike",3);


System.out.println("velocita biciA:");
		velocita=tastiera.nextInt();
		biciA.aumentaVelocita(velocita);
		biciA.stampaStato();
System.out.println("velocita biciB :");
		velocita=tastiera.nextInt();
		biciB.aumentaVelocita(velocita);
		biciB.stampaStato();
System.out.println("velocita biciC :");		
		velocita=tastiera.nextInt();
		biciC.aumentaVelocita(velocita);
		biciC.stampaStato();

			if(biciA.getVelocita()>biciB.getVelocita()&&biciA.getVelocita()> biciC.getVelocita()){
				System.out.println("la bici piu veloce e la biciA:"+biciA);

			}else
			if(biciB.getVelocita()>biciA.getVelocita()&&biciB.getVelocita()> biciC.getVelocita()){
				System.out.println("la bici piu veloce e la biciB:"+biciB);
			}else
			if(biciC.getVelocita()>biciA.getVelocita()&& biciC.getVelocita()>biciB.getVelocita()){
				System.out.println("la bici piu veloce e la biciC:"+biciC);

			}



	}

}