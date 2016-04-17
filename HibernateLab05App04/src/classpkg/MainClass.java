/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpkg;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import pkg.Account;

/**
 *
 * @author Karim
 */
public class MainClass {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateLab05App04PU");
        EntityManager em = emf.createEntityManager();
        Account acc = new Account();
        acc.setUserName("qeqeqeqe");
        acc.setBirthday(new Date());
        acc.setPhone("0112208496");
        acc.setFullName("karim mohsen");
        acc.setAddress("Zmalek");
        acc.setPassword("my password");
        em.getTransaction().begin();
        em.persist(acc);
        em.getTransaction().commit();
        em.close();
    }

}
