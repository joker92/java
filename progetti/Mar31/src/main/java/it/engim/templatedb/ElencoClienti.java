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

import it.engim.beans.Cliente;
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
public class ElencoClienti extends WebPage{

    public ElencoClienti() {
        
        ArrayList<IColumn<Cliente,String>>colonne=new ArrayList<IColumn<Cliente,String>>();
        
        colonne.add(new PropertyColumn<Cliente,String>
        (Model.of("Codice"),"id"));
        colonne.add(new PropertyColumn<Cliente,String>
        (Model.of("Nome"),"cognome"));
        
        
        add(new DefaultDataTable<Cliente,String>(
                "clienti",colonne,
                new ClienteDataProvider(),10));//il 1o è il numero di righe per ogni pagina 
        
        
        
    }
    
}
