/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar03;

/**
 *
 * @author svilupposw
 */
public class Mar03 {
 public static void ordina(int[]arr){
     
     {
         
     boolean inOrdine=false;
     //mette in ordine l array con una variabile temporanea in ordine crescente 
     while(!inOrdine){
         inOrdine=true;
         for(int i=0;i <(arr.length -1);i++) {
             if (arr[i]>arr[i+1])
             {
                 int tmp =arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=tmp;
                 inOrdine=false;
             }
         }
     }
     }
 
 }
 
    public static void main(String[] args) {
         int[] temperatura={
         17,15,8,13,22,26,21
         };
         ordina(temperatura);
         
            for(int t: temperatura)
                System.out.println(t);
    }
}


