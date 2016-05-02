package Anagrafe;

public class Cane {

    public static int lastId = 0;

    private String nome;
    private String sesso;
    private int eta;
    private int id;

    public Cane(String nome, String sesso, int eta) {

        this.nome = nome;
        this.sesso = sesso;
        this.eta = eta;

        Cane.lastId ++;
        this.id = Cane.lastId;

    }

    public static int getLastId() {
        return lastId;
    }

    public static void setLastId(int lastId) {
        Cane.lastId = lastId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
