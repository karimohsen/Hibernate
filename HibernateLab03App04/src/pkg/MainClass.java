/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Karim
 */
public class MainClass {

    public static void main(String[] args) {

        SessionFactory fact = new org.hibernate.cfg.Configuration().configure("pkg\\hibernate.cfg.xml").buildSessionFactory();
        Session session = fact.openSession();
        //Query query = session.createSQLQuery("CALL GetAllUsers()").addEntity(Buyer.class);
        Query query = session.getNamedQuery("GetAllUsers");
        List result = query.list();
        for (int i = 0; i < result.size(); i++) {
            Buyer buy = (Buyer) result.get(i);
            System.out.println(buy.getValue());
        }
    }

}
