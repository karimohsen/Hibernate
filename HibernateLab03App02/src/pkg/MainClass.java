/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Karim
 */
public class MainClass {

    public static void main(String[] args) {

        SessionFactory fact = new org.hibernate.cfg.Configuration().configure("pkg\\hibernate.cfg.xml").buildSessionFactory();
        Session session = fact.openSession();
        Product prod = new Product();
        prod.setId(2);
        //====================================HQL=====================================
        List<BuyerBidProduct> q = session.createQuery("from BuyerBidProduct p where ? member of p.product ").setParameter(0, prod).list();
        for (BuyerBidProduct q1 : q) {
            System.out.println("bid quantity  ====> ");
            System.out.println(q1.getQuantity());
            System.out.println("bid product name ====> ");
            System.out.println(q1.getProduct().getName());
        }
        //==================================Criteria====================================
        Criteria productcriteria = session.createCriteria(BuyerBidProduct.class).add(Restrictions.eq("product", prod));
        List result = productcriteria.list();
        for (int i = 0; i < result.size(); i++) {
            BuyerBidProduct p = (BuyerBidProduct) result.get(i);
            System.out.println("bid Criteria");
            System.out.println("bid quantity=>" + p.getQuantity());
            System.out.println("bid product name=>" + p.getProduct().getName());
        }
    }

}
