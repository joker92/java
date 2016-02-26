/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author svilupposw
 */
public class Consulente extends Persona{
    
    private double costoOrario;
    private String areaCompotenza;
    private String partitaIva;

    public double getCostoOrario() {
        return costoOrario;
    }

    public void setCostoOrario(double costoOrario) {
        this.costoOrario = costoOrario;
    }

    public String getAreaCompotenza() {
        return areaCompotenza;
    }

    public void setAreaCompetenza(String areaCompotenza) {
        this.areaCompotenza = areaCompotenza;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }
}
