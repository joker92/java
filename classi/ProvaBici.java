
import java.util.Scanner;



public class ProvaBici{

	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		int velocita;
                

		Bicicletta biciA;
		Bicicletta biciB;
		Bicicletta biciC;
                Persona ragazzoA;
                Persona ragazzoB;
                Persona ragazzoC;

                ragazzoA=new Persona("gianni","pippo");
                ragazzoB=new Persona("luca","paperino");
                ragazzoC=new Persona("laura","ciao");
                
                
		biciA=new Bicicletta("bmx",ragazzoA,2,15);
		biciB=new Bicicletta("graziella",ragazzoB,1,20);
		biciC=new Bicicletta("montambike",ragazzoC,3,30);
                
                
                

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