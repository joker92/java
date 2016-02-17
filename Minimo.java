import java.util.Scanner;
// si richiedono 10 valori e si ffornisce in oput la media aritmetica	

	class Minimo {
  public static void main(String[] args) {
  	Scanner tastiera=new Scanner(System.in);
    int i;
    double somma, media, minimo;

    somma=0;
    minimo=0;
    
    for(i=0; i<10-1; i++) {
	System.out.println("valore "+i);
	somma=tastiera.nextInt();     
  if(i==0){
    minimo = somma;
  }else{
    if(somma<minimo){
      minimo=somma;
    }
  }

    }

  

    System.out.println("Minimo = " + minimo );
  }
}

