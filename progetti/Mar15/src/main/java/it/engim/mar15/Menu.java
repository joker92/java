/*
 * Copyright 2016 svilupposw.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.engim.mar15;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.repeater.RepeatingView;

/**
 *
 * @author svilupposw
 */
public class Menu extends Panel{
    
    public Menu(String id) {
        super(id);
        BookmarkablePageLink home= new BookmarkablePageLink("home",HomePage.class);
        BookmarkablePageLink chisiamo= new BookmarkablePageLink("chisiamo",ChiSiamo.class);
    add(home);
    add(chisiamo);
   String[] riga={"riga1","riga2","riga3","riga4","riga5"};
    
    RepeatingView tab =new RepeatingView("riga");
    /*tab.add(new Label(tab.newChildId(),"riga1"));
    tab.add(new Label(tab.newChildId(),"riga2"));
    tab.add(new Label(tab.newChildId(),"riga3"));
    tab.add(new Label(tab.newChildId(),"riga4"));
    tab.add(new Label(tab.newChildId(),"riga5"));
    tab.add(new Label(tab.newChildId(),"chi ama (|) metta una riga"));*/
    
      for(String r: riga){
           tab.add(new Label(tab.newChildId(),r));
      
      }
            
                
        
    add(tab);
    }
    
    
}
