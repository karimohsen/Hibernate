/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Karim
 */
public class MainClass {
    public static void main(String[]args){
        SessionFactory fact = new Configuration().configure("pkg\\hibernate.cfg.xml").buildSessionFactory();
        Session session = fact.openSession();
        Person person = new Person();
        person.setFirstName("karim");
        person.setLastName("mohsen");
        Student student = new Student();
        student.setDepartment("Java");
        student.setFirstName("z3bola");
        student.setLastName("el-2ola");
        Teacher teach = new Teacher();
        teach.setFirstName("ahmed");
        teach.setLastName("medhat");
        teach.setHireDate(new Date());
        session.beginTransaction();
        session.persist(person);
        session.getTransaction().commit();
        session.beginTransaction();
        session.persist(teach);
        session.getTransaction().commit();
        session.beginTransaction();
        session.persist(student);
        session.getTransaction().commit();
    }
}
