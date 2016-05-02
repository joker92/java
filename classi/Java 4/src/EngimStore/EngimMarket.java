package EngimStore;

import interfacce.Scontabile;
import interfacce.Vendibile;

import java.util.Arrays;

public class EngimMarket {

    protected int incasso;
    protected Vendibile [] venduti = new Vendibile[0];
    protected boolean saldi = false;
    protected Comparable [] workArray;

    public void vendi(Vendibile product){

        // Refresh Incasso
        if(product instanceof Scontabile && saldi ){
            this.incasso += ((Scontabile) product).getPrezzoScontato();
        }
        else {
            this.incasso += product.getPrezzo();
        }

        // Add venduti

        int arrayLenght = this.venduti.length;

        Vendibile [] newVenduti = new Vendibile[arrayLenght+1];

        for(int I =0; I<venduti.length; I++){
            newVenduti[I] = venduti[I];
        }

        newVenduti[arrayLenght] = product;
        venduti = newVenduti;

    }

    public boolean isSaldi() {
        return saldi;
    }

    public void setSaldi(boolean saldi) {
        this.saldi = saldi;
    }

    public int getIncasso() {
        return incasso;
    }

    public Vendibile[] getVenduti() {
        return venduti;
    }

    public void printVenduti(){
        System.out.println("------- Prodotti Venduti --------");

        for(Vendibile venduto : this.venduti){
            System.out.println("Nome: "+venduto.getNome()+" - Prezzo: "+venduto.getPrezzo());
        }
    }

    public Vendibile [] sort(){
        Vendibile [] newArray = this.venduti;
        Arrays.sort(newArray);
        return newArray;
    }

    public Vendibile getMax(){

        Vendibile [] newarray = this.sort();
        int arrayLength = newarray.length-1;
        return newarray[arrayLength];
    }

    public Vendibile getMin(){
        Vendibile [] newarray = this.sort();
        return newarray[0];
    }

}
