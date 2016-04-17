/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.type.Type;
/**
 *
 * @author Karim
 */
public class MainClass {

    public static void main(String[] args) {

        SessionFactory fact = new org.hibernate.cfg.Configuration().configure("pkg\\hibernate.cfg.xml").buildSessionFactory();
        Session session = fact.openSession();
        Product prod = new Product();
        prod.setId(3);
        //====================================HQL=====================================
        Query q = session.createQuery("select sum( purchase.amount*purchase.quantity ) from Buyer_Buy_Product purchase");
        double total = (Double) q.uniqueResult();
        System.out.println("total = " + total);
        //==================================Criteria====================================
        Criteria productcriteria = session.createCriteria(Buyer_Buy_Product.class).setProjection(Projections.sqlProjection("sum(amount * quantity) as total", new String[]{"total"}, new Type[]{Hibernate.DOUBLE}));
        double sum = (Double)productcriteria.uniqueResult();
        System.out.print("Criteria : ");
        System.out.println("total is = "+sum);
    }

}
