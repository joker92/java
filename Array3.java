
  import java.util.Scanner;



class Array3 {
  public static void main(String[] args) {
    int x[]={12, 45, 78, 11, 44, 60};
    int i;
    int massimo;
    int minimo;

    massimo=x[0];
    minimo=x[0];

    for(i=0; i<=x.length-1; i=i+1) {
      if( x[i]>massimo ) {
        massimo=x[i];
      }else
      if(x[i]<minimo ){
            minimo=x[i];
      }
    }

    System.out.println("Il massimo e' "+massimo);
    System.out.println("Il minimo e' "+minimo);
     
  }
}


