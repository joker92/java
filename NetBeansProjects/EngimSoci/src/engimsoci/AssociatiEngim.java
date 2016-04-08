/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engimsoci;
public class AssociatiEngim{

  static SocioEngim getSocCredMax(SocioEngim[] listaSoci){
      SocioEngim toRet=null;
      int maxVal=Integer.MIN_VALUE;
      for(int i=0; i<listaSoci.length; i++){
          if(listaSoci[i].getCrediti()>maxVal){
              maxVal=listaSoci[i].getCrediti();
              toRet=listaSoci[i];
          }
      }
      return toRet;
  }

static SocioPremium getSPMMax(SocioEngim[] listaS){
    SocioPremium toRet=null;
    int maxVal=Integer.MIN_VALUE;
    for(int i=0; i<listaS.length; i++){
        if( listaS[i] instanceof SocioPremium ){

    		if( ((SocioPremium)listaS[i]).getPuntiMensa()>= maxVal){
     			maxVal= ((SocioPremium)listaS[i]).getPuntiMensa();
     			toRet=((SocioPremium)listaS[i]);
		}             
         }
     }
     return toRet;
  } 


    public static void main(String[] args){
        Persona pers = new Persona("Gennaro","Esposito",1955);
        System.out.println(pers);

   	SocioEngim socioE = new SocioEngim("Sara","Lapietra",1990);


	SocioPlus socioPlus = new SocioPlus("Gigi","Latrottola",1980,"latrottola@gigi.it");

	SocioPremium socioPremium = new SocioPremium("Mimi","Aiuara",1980,"mimi@midori.it",0);
      

	SocioEngim[] arrSoci= new SocioEngim[6];
	arrSoci[0]=socioE;   
	arrSoci[1]=socioPlus;
	arrSoci[2]=socioPremium;
	arrSoci[3]=new SocioEngim("Francesca","Carmagnola",1980);
	arrSoci[4]=new SocioPlus("Mario","Rossi",1970,"mario.rossi@engim.it");
	arrSoci[5]=new SocioPremium("Franco","Franchi",1940,"francof@engim.it",0);   

	     // aggiungi ore lezione
	   int addOre = 3;
	   for(int i=0; i<arrSoci.length; i++){
	       arrSoci[i].addOreLezione(addOre);
	       arrSoci[i].addLezioneStandard();
	   }

	   // Stampa
	   System.out.println(" -------------- ");
	   for(int i=0; i<arrSoci.length; i++){
	       System.out.println(" ******** ");
	       System.out.println(arrSoci[i]);
	       System.out.println(" ******** ");
	   }
	   
	   SocioEngim scMax= getSocCredMax(arrSoci);
	   System.out.println(" *-*-* SOCIO MAX: \n" +scMax );
	   SocioPremium scPrMax= getSPMMax(arrSoci);
	   System.out.println(" *-*-* SOCIO PUNTI MENSA MAX: \n" +scPrMax );

 }

}