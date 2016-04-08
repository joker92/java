/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrafecanina;

/**
 *
 * @author svilupposw
 */
public class Coppia {
    
	private Persona persona;
	private Cane cane;

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Cane getCane() {
		return cane;
	}

	public void setCane(Cane cane) {
		this.cane = cane;
	}
	
	public Coppia (Persona persona, Cane cane){
		this.persona = persona;
		this.cane = cane;
	}
	
	

}
