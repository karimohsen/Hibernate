/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatelab01app01;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Karim
 */
public class HibernateLab01App01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("D:\\iti images\\Dish Party_6-11-2014\\IMG_5376.jpg");
        byte[] bFile = new byte[(int) file.length()];
 
        try {
	     FileInputStream fileInputStream = new FileInputStream(file);
	     //convert file into array of bytes
	     fileInputStream.read(bFile);
	     fileInputStream.close();
        } catch (Exception e) {
	           System.out.println("Error in reading the image");
        }
        SessionFactory fact = new Configuration().configure("hibernatelab01app01\\hibernate.cfg.xml").buildSessionFactory();
        Session session = fact.openSession();
        UserData data = new UserData();
        data.setUserName("dasdas");
        data.setBirthday(new Date());
        data.setPhone("0112208496");
        data.setFullName("ahmed medhat");
        data.setAddress("Zmalek");
        data.setPassword("my password");
        data.setImage(bFile);
        session.beginTransaction();
        session.persist(data);
        session.getTransaction().commit();
        System.out.println("Insertion is complete");

    }

}
