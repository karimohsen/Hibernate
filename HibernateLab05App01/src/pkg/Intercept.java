/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;


import java.io.Serializable;
import java.util.Iterator;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
/**
 *
 * @author Karim
 */
public class Intercept extends EmptyInterceptor{
    
    public void onDelete(Object entity,Serializable id,Object[] state,String[] propertyNames,Type[] types) {
       // do nothing
   }

   
   public boolean onLoad(Object entity,Serializable id,Object[] state,String[] propertyNames,Type[] types) {
       // do nothing
       return true;
   }
   // This method is called when Employee object gets created.
   public boolean onSave(Object entity,Serializable id,Object[] state,String[] propertyNames,Type[] types) {
       if ( entity instanceof UserData ) {
          System.out.println("Create Operation");
          state[1]="batee5a";
          return true; 
       }
       return false;
   }
   //called before commit into database
   public void preFlush(Iterator iterator) {
      System.out.println("preFlush");
   }
   //called after committed into database
   public void postFlush(Iterator iterator) {
      System.out.println("postFlush");
   }
    
}
