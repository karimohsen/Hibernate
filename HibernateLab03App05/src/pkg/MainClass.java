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
        List<View> q = session.createQuery("from View").list();
        for (View v : q) {
            System.out.println("fullname ====> ");
            System.out.println(v.getFullName());
        }
    }

}
