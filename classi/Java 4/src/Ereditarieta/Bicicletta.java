package Ereditarieta;

import interfacce.Vendibile;

public class Bicicletta implements Vendibile, Comparable{

    protected String marca;
    protected String proprietario;
    protected int velocita;
    protected int prezzo;

    public Bicicletta(String marca, String proprietario, int velocita) {
        this.marca = marca;
        this.proprietario = proprietario;
        this.velocita = velocita;
    }

    public Bicicletta(int prezzo, String proprietario, String marca) {
        this.prezzo = prezzo;
        this.proprietario = proprietario;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    public String getNome() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public void stampaStato (){
        System.out.println("proprietario: "+this.proprietario);
        System.out.println("marca: "+this.marca);
    }

    @Override
    public String toString() {
        return "Bicicletta{" +
                "marca='" + marca + '\'' +
                ", proprietario='" + proprietario + '\'' +
                ", velocita=" + velocita +
                '}';
    }

    @Override
    public int getPrezzo() {
        return this.prezzo;
    }

    @Override
    public int compareTo(Object o) {

        return this.prezzo-((Bicicletta)o).getPrezzo();

    }

}
