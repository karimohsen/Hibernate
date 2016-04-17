/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import org.hibernate.HibernateException;
import org.hibernate.event.SaveOrUpdateEvent;
import org.hibernate.event.def.DefaultSaveOrUpdateEventListener;

/**
 *
 * @author Karim
 */
public class CustomListener extends DefaultSaveOrUpdateEventListener {

    @Override
    public void onSaveOrUpdate(SaveOrUpdateEvent soue) throws HibernateException {
        System.out.println("Save or update");
        super.onSaveOrUpdate(soue);
    }
    
}
