public class Bicicletta{
	String modello;
	String nomeProprietario;
	int marcia;
	int velocita;


	public Bicicletta(String modelloP,String nomeProp , int marciaIniz ,int velocitaIniz){
			this.modello = modelloP;
			this.marcia = marciaIniz;
			this.velocita = velocitaIniz;
			this.nomeProprietario=nomeProp;

}
public Bicicletta(itn marciaIniz, int velocitaIniz){
			marcia=marciaIniz;
			velocita=velocitaIniz;
}

public String getModello(){
	return modello;

}


public String nomeProprietario(){
	return nomeProprietario;

}

public int getMarcia(){
	return marcia;
}		


public void cambiaMarcia(int nMarcia){
		this.marcia = nMarcia;

}


public int getVelocita (){
	return velocita;

}

public void aumentaVelocita(int nVelocita){
	velocita+= nVelocita;

}
public void stampaStato(){
	    System.out.println("Modello: "+modello+"\nnome proprietario: "+nomeProprietario+"\nvelocita: "+velocita+"\nmarcia: "+marcia"");
}



public static void main(){




}
}




