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
public class Cane {
    private String nome;
	private int eta;
	private String sesso;
	private int id;
	private static int counter=0;
	
	
	
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
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	/*public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Cane.id = id;
	}*/

	public Cane(String nome, int eta, String sesso){
		this.nome = nome;
		this.eta = eta;
		this.sesso = sesso;
		this.id = counter;
		counter++;
	}



}
