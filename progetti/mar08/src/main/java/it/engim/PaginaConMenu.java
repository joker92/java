
package it.engim;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class PaginaConMenu extends WebPage{

    public PaginaConMenu(PageParameters parameters) {
        super(parameters);
        
        BookmarkablePageLink home =
                new BookmarkablePageLink("home",HomePage.class);
        add(home);
        
        BookmarkablePageLink chisiamo =
                new BookmarkablePageLink("chisiamo",Chisiamo.class);
        add(chisiamo);
    }
    
}
