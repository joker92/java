
package it.engim.mar15;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;



/**
 *
 * @author svilupposw
 */
public class DocumentoPanel extends Panel{
    
    public DocumentoPanel(String id) {
        super(id);
        
        Label titolo =new Label("titolo","Questo è un Documento");
        add(titolo);
        
        

    }
    
}
