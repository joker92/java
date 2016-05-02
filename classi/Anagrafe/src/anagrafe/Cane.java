/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrafe;

/**
 *
 * @author svilupposw
 */
public class Cane {

    //cane
    private String nomeCane;
    private int etaCane;
    private String sesso;
    static int id = 0;

    public Cane(String nomeCane, int etaCane, String sesso) {
        this.nomeCane = nomeCane;
        this.etaCane = etaCane;
        this.sesso = sesso;
    }

    public String getNomeCane() {
        return nomeCane;
    }

    public void setNomeCane(String nomeCane) {
        this.nomeCane = nomeCane;
    }

    public int getEtaCane() {
        return etaCane;
    }

    public void setEtaCane(int etaCane) {
        this.etaCane = etaCane;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Cane.id = id;
    }
  
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
   
}
