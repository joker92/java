  import java.util.Scanner;


public class Fattoriale {

    public static void main(String args[]) {
      Scanner tastiera=new Scanner(System.in);

        System.out.print("Inserire numero: "); 
        int n = tastiera.nextInt();

        if (n < 0) {
            System.out.println("Impossibile calcolare il fattoriale di un numero negativo.");
            return;
        }

        int fat = 1*n;
        for (int i = 1; i < n; i++) {
            fat = fat*i;
        }
        System.out.println("Il fattoriale di " + n + " è " + fat);
    }

}