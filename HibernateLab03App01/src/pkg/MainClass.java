/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Karim
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        SessionFactory fact = new org.hibernate.cfg.Configuration().configure("pkg\\hibernate.cfg.xml").buildSessionFactory();
        Session session = fact.openSession();
        Category cat = new Category();
        cat.setId(5);
        //====================================HQL=====================================
        List<Product> q = session.createQuery("from Product p where ? member of p.categories ").setParameter(0, cat).list();
        for (Product q1 : q) {
            System.out.println("Products desc ====> ");
            System.out.println(q1.getDescription());
            System.out.println("Products Quantity ====> ");
            System.out.println(q1.getQuantity());
        }
        //==================================Criteria====================================
//        Criteria criteria = session.createCriteria(Category.class).add(Restrictions);
          //Criteria criteria = session.createCriteria(Product.class).createAlias("","").setProjection(Projections.projectionList().add(Projections.property("categories")));
        Criteria productcriteria = session.createCriteria(Product.class);
        Criteria criteria = productcriteria.createCriteria("categories");
        List result = criteria.list();
          for(int i = 0 ; i < result.size() ; i++){
              Product p = (Product)result.get(i);
              System.out.println("products=>"+p.getName());
          }
    }
    
}
