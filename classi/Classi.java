public class Bicicletta{
	string modello;
	string nomeProprietario;
	int marcia;
	int velocita;

}

public Bicicletta(string modello,string nomeProprietario , int marcia ,int velocita){
			modello=modelloP;
			marcia=marciaIniz;
			velocita=velocitaIniz;

}
public Bicicletta(string modello, int velocita){
			modello=modelloA;
			velocita= 15;
}

public string getModello(){
	return modello;
System.out.println(modello);
}


public string nomeProprietario(){
	return nomeProprietario;

}

public int getMarcia(){
	return marcia;
}		


public void cambiaMarcia(int nMarcia){
		marcia=nMarcia;
}


public int getVelocita (){
	return velocita;

}

public void aumentaVelocita(int nVelocita){
	velocita=nVelocita

}

