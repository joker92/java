/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regioni;

/**
 *
 * @author svilupposw
 */
public class Regioni {
    private int id;
    private String nome;
    private String[] provincia;

    public Regioni() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getProvincia() {
        return provincia;
    }

    public void setProvincia(String[] provincia) {
        this.provincia = provincia;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
