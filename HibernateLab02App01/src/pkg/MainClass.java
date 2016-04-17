/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
        
        User user = new User();
        user.setAddress("Abbassay");
        user.setDateOfBirth(new Date());
        user.setRegistrationDate(new Date());
        user.setEmail("karim@hotmail.com");
        user.setFullName("karim abdelmohsen");
        user.setMobile("01112208496");
        user.setPassword("password");
        user.setPhone("0235842450");
        user.setUserName("karimohsen");
        //====seller===========
        Seller sell = new Seller();
        sell.setUser(user);
        sell.setValue("100");
        //===========buyer==========
        Buyer buy = new Buyer();
        buy.setUser(user);
        buy.setValue("200");
        //=========Category=============
        Category cat = new Category();
        cat.setValue("2000");
        cat.setDescription("Category Desc");
        Set cat_set = new HashSet();
        cat_set.add(cat);
        //=================product==========
        Product product = new Product();
        product.setDescription("product descr");
        product.setExpirationDate(new Date());
        product.setFinishDate(new Date());
        product.setManufacturingDate(new Date());
        product.setQuantity(100);
        product.setOfferedDate(new Date());
        product.setName("Product 1");
        product.setManufacturingName("Manufacturer");
        product.setCategories(cat_set);
        //==================BuyerBidProduct=======================
        BuyerBidProduct buyerbid = new BuyerBidProduct();
        buyerbid.setAmount(120.03f);
        buyerbid.setBuyer(buy);
        buyerbid.setQuantity(100);
        buyerbid.setDate(new Date());
        buyerbid.setProduct(product);
        //====================buyer_buy_product=======================
        Buyer_Buy_Product buyerbuy = new Buyer_Buy_Product();
        buyerbuy.setAmount(105.30f);
        buyerbuy.setQuantity(1200);
        buyerbuy.setProduct(product);
        buyerbuy.setPaymentDate(new Date());
        buyerbuy.setBuyer(buy);
        //===================================================
        session.beginTransaction();
        session.persist(user);
        session.persist(sell);
        session.persist(buy);
        session.persist(cat);
        session.persist(product);
        session.persist(buyerbid);
        session.persist(buyerbuy);
        
        session.getTransaction().commit();
        
        System.out.println("Insertion is complete");
        
    }
    
}
