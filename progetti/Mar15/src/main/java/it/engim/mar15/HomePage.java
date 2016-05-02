package it.engim.mar15;

import it.engim.mar15.beans.Persona;
import javax.persistence.EntityManager;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.repeater.RepeatingView;

public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        super(parameters);

        add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

        DocumentoPanel doc = new DocumentoPanel("docum");
        add(doc);
        add(new Menu("menu"));

        EntityManager conn = PM.getEM();
        RepeatingView persone = new RepeatingView("repeating");

        try {
            /*Persona p= conn.find(Persona.class, new Integer(1));
           add(new Label("nome", p.getNome()));
           add(new Label("cognome", p.getCognome()));
           add(new Label("codicef", p.getCodiceFiscale()));
           add(new Label("note", p.getNote()));*/
            for (int i = 1; i <= 5; i++) {
                Persona l = conn.find(Persona.class, new Integer(i));
                String li = l.getNome() + " " + l.getCognome()+" "+"data nascita:  "+l.getData_nascita()+","+" data morte:  "+ l.getData_morte()+" ";
                persone.add(new Label(persone.newChildId(), li));

            }
            add(persone);
        } /* catch (Exception e) {
            System.out.println("Errore");

        }*/ finally {
            conn.close();
            //   System.out.println("Comunque vada  qui io c passo ");
        }
        // System.out.println("invece qui ci passo solo se c'è la catch");
    }
}
