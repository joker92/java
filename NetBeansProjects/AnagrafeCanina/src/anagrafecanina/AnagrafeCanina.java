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
public class AnagrafeCanina {

    
	Coppia [] coppie;
	
	public AnagrafeCanina(int i){
		this.coppie = new Coppia[i];
	}
	
	public AnagrafeCanina(Coppia[] coppie){
		this.coppie = coppie;
	}
	
	
	/*methods here:*/
	public void contaNumeroCaniConPadrone(String nomePadrone){
		
		int count = 0;
		
		for (int i=0; i<coppie.length; i++){
			if(coppie[i].getPersona().getNome() == nomePadrone){
				count ++;
				
			} 
		}
		if (count != 0) {
		System.out.println(nomePadrone + " ha " + count + " cani");
		} else {
			System.out.println(nomePadrone + " non esiste");
		}
	}
	
	public String ritornaPadrone(int id){
		for (int i=0; i<coppie.length; i++){
			if(coppie[i].getCane().getId() == id){
				return coppie[i].getPersona().getNome();		
			}
		}
				return "non esiste questo id!";
	}
	
	public void stampaNomeCanePadrone(){
		for (int i=0; i<coppie.length; i++){
		System.out.println(coppie[i].getPersona().getNome());
		System.out.println(coppie[i].getCane().getNome());
		}
	}
	
	public void stampaNomeCompletoCani(){
		for (int i=0; i<coppie.length; i++){
		System.out.println(coppie[i].getPersona().getCognome());
		System.out.println(coppie[i].getCane().getNome());
		}
	}
	
	public void stampaNomeCanePadrone(int pos){
		
			if(pos <= coppie.length){
			System.out.println(coppie[pos].getPersona().getNome());
			System.out.println(coppie[pos].getCane().getNome());
			} else {
				System.out.println("Non ci sono cani né padroni in questa posizione");
			}
	}
	
            
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("beppe", "trz", "CNDMTT90M05L219E");
		Persona persona2 = new Persona("jek", "joker", "CCCAHJUAHSF842U2");
		Persona persona3 = new Persona("Mario","Rossi","2385271ERRGASG42");
                
		
		Cane cane1 = new Cane("Dio", 20000000, "M");
		Cane cane2 = new Cane("Athos", 4, "M");
		Cane cane3 = new Cane("Dolly", 10, "F");
		Cane cane4 = new Cane("Pluto", 1, "M");
                
		
		Coppia coppia1 = new Coppia(persona1, cane1);
		Coppia coppia2 = new Coppia(persona2, cane2);
		Coppia coppia3 = new Coppia(persona3, cane3);
		Coppia coppia4 = new Coppia(persona3, cane4);
            
		
		Coppia[] coppie = {coppia1, coppia2, coppia3,coppia4};
		AnagrafeCanina anagrafe = new AnagrafeCanina(coppie);
		
		anagrafe.stampaNomeCanePadrone();
		anagrafe.stampaNomeCompletoCani();
		anagrafe.ritornaPadrone(1);
		anagrafe.contaNumeroCaniConPadrone("Mario");
	}

}   
   

