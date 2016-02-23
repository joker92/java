
import java.util.Scanner;



class Array3 {
  public static void main(String[] args) {
    int x[]={12, 45, 78, 11, 44, 60};
    int i;
    int massimo;
    int minimo;
    int posMax=0;
    int posMin=0;

    massimo=x[0];
    minimo=x[0];
//stampa il massiomo numero dentro l array
    for(i=0; i<=x.length-1; i=i+1) {
      if( x[i]>massimo ) {
        massimo=x[i];
        posMax = i;
      }else //stampa il minimo numero dentro l array
      if(x[i]<minimo ){
        minimo=x[i];
        posMin = i;
      }
        if(x[i]>x[posMax])
          posMax=i;
        if(x[i]<x[posMin])
          posMin=i;
            i++;
    }

      int temp=x[posMax];
      x[posMax]=x[posMin];
      x[posMin]=temp;
    stampaArray(x);

    System.out.println("Il massimo e' "+massimo);
    System.out.println("Il minimo e' "+minimo);


  }


//stampa tutto il contenuto dell array 
    
    public static void stampaArray(int [] x) {

      for (int i = 0; i < x.length; i++) {

        System.out.println("Elemento " + i + ": " + x[i]);
      }
    }
 
}


