package it.engim.templatedb;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
                 String valore= getApplication().getFrameworkSettings().getVersion();
                 Label eticVers=new Label("version",valore);
		add(eticVers);
                   
                BookmarkablePageLink elencoClienti =
                new BookmarkablePageLink("ElencoClienti",ElencoClienti.class);
                    add(elencoClienti);
		// TODO Add your page's components here

    }
}
