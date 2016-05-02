
package it.engim.mar15;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author svilupposw
 */
public class ChiSiamo extends WebPage {

    public ChiSiamo(PageParameters parameters) {
        super(parameters);
        
        add(new Menu("menu"));

    }
    
}
