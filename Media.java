import java.util.Scanner;
// si richiedono 10 valori e si ffornisce in oput la media aritmetica	

	class Media {
  public static void main(String[] args) {
  	Scanner tastiera=new Scanner(System.in);
    int i;
    double somma, media;

    somma=0;

    for(i=0; i<10-1; i++) {
	System.out.println("valore "+i);
	somma=somma+tastiera.nextInt();     

    }

    media=somma/10;

    System.out.println("Media = " + media );
  }
}

