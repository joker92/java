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
package it.engim.templatedb;


import it.engim.teamplatedb.beans.Articolo;
import java.util.ArrayList;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

/**
 *
 * @author svilupposw
 */
public class ElencoArticoli extends WebPage{

    public ElencoArticoli() {
        
        ArrayList<IColumn<Articolo,String>>colonne=new ArrayList<IColumn<Articolo,String>>();
        
        colonne.add(new PropertyColumn<Articolo,String>
        (Model.of("Codice"),"codice"));
        colonne.add(new PropertyColumn<Articolo,String>
        (Model.of("Descrizione"),"descrizione"));
         colonne.add(new PropertyColumn<Articolo,String>
        (Model.of("Peso"),"peso"));
        
        
        add(new DefaultDataTable<Articolo,String>(
                "articoli",colonne,
                new ArticoloDataProvider(),10));//il 1o è il numero di righe per ogni pagina 
        
        
        add(new MenuPanel("menu"));
    }
    
}
