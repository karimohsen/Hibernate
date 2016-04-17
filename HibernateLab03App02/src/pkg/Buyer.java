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
public class Buyer implements  Serializable{
    private int id;
    private String value;
    private User user;
    private Set buyBidProduct=new HashSet();
    private Set buyBuyProduct=new HashSet();

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

    public Set getBuyBidProduct() {
        return buyBidProduct;
    }

    public void setBuyBidProduct(Set buyBidProduct) {
        this.buyBidProduct = buyBidProduct;
    }

    public Set getBuyBuyProduct() {
        return buyBuyProduct;
    }

    public void setBuyBuyProduct(Set buyBuyProduct) {
        this.buyBuyProduct = buyBuyProduct;
    }


}
