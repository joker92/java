/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impiegato;

/**
 *
 * @author svilupposw
 */
public class Impiegato {
        String nome;
        int stipendio;
    int getStipendio;
    

        
        
    public Impiegato(String nome, int stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
    public void aumentaSalario(int nSalario){
        stipendio +=nSalario;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
