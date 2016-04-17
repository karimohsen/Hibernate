/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Karim
 */
public class Seller implements  Serializable{
     private Set products = new HashSet();
     private int id;
     private String value;
     private User user;
    public Set getProducts() {
        return products;
    }

    public void setProducts(Set products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
     
}
