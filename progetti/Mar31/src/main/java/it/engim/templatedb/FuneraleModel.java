package it.engim.templatedb;

import it.engim.beans.Cliente;
import javax.persistence.EntityManager;
import org.apache.wicket.model.LoadableDetachableModel;

public class FuneraleModel extends LoadableDetachableModel<Funerale>{

    private int id;
    
    public FuneraleModel(int id)
    {
        this.id= id;
    }
    @Override
    protected Funerale load() 
    {
        //carica un cliente dal database
        
        //APRE UNA CONNESSIONE DAL DATABASE
        EntityManager em = PM.getEM();
        try
        {
            Funerale c = em.find(Funerale.class, id);
             return c;
        }
        finally
        {
            em.close();
        }
    }
    
}
