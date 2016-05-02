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
import it.engim.beans.Lapide;
import javax.persistence.EntityManager;
import org.apache.wicket.model.LoadableDetachableModel;

/**
 *
 * @author svilupposw
 */
public class LapideModel extends LoadableDetachableModel<Lapide> {
        private int id;

    public LapideModel(int id) {
        this.id = id;
    }
        
    @Override
    protected Lapide load() {
      EntityManager em = PM.getEM();
        try
        {
            Lapide c = em.find(Lapide.class, id);
             return c;
        }
        finally
        {
            em.close();
        }
    }
    
    }
    

