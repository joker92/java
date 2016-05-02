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
public class Coppia {
    Cane cane;
    Padrone padrone;

    public Coppia(Cane cane, Padrone padrone) {
        this.cane = cane;
        this.padrone = padrone;
    }

    public Cane getCane() {
        return cane;
    }

    public void setCane(Cane cane) {
        this.cane = cane;
    }

    public Padrone getPadrone() {
        return padrone;
    }

    public void setPadrone(Padrone padrone) {
        this.padrone = padrone;
    }
    
    
}
