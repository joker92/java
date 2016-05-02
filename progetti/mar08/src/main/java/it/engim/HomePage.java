package it.engim;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends PaginaConMenu {
    
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
            
		super(parameters);
                
                /*String versione= getApplication().
                        getFrameworkSettings().getVersion();
                Label labvers=new Label("version",versione);
                //il metodo add arriva dalla classe web page
		add(labvers);
                String nome= getApplication().
                        getFrameworkSettings().getVersion();
                
                 Label mionome =new Label("mionome","giuseppe joker");
                 add(mionome);
		// TODO Add your page's components here

                BookmarkablePageLink page=
                         new BookmarkablePageLink("page",DoveSiamo.class);
                 add(page);

*/
                
                
    }
}
