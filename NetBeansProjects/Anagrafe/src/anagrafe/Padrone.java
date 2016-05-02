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
public class Padrone {
    private String nomeProprietario;
    private String cognomeProprietario;
    private String codiceFiscale;

    public Padrone(String nomeProprietario, String cognomeProprietario, String codiceFiscale) {
        this.nomeProprietario = nomeProprietario;
        this.cognomeProprietario = cognomeProprietario;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCognomeProprietario() {
        return cognomeProprietario;
    }

    public void setCognomeProprietario(String cognomeProprietario) {
        this.cognomeProprietario = cognomeProprietario;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public static void main(String[] args) {

               
                    
    }
}
