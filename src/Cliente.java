/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author svilupposw
 */
public class Cliente {
    private String nome;
    private String cognome ;
    private int età;
    
 public Cliente (String nome,String cognome,int età){
     this.nome=nome;
     this.cognome=cognome;
     this.età= età;
 }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }
 
}