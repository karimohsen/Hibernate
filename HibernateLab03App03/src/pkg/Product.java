/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Karim
 */
public class Product implements  Serializable{
    private int id;
    private Seller seller;
    private String name;
    private String description;
    private String manufacturingName;
    private Date manufacturingDate;
    private Date expirationDate;
    private int quantity;
    private Date offeredDate;
    private Date finishDate;
    private Set categories = new HashSet();
    private Set buyBidProduct=new HashSet();

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturingName() {
        return manufacturingName;
    }

    public void setManufacturingName(String manufacturingName) {
        this.manufacturingName = manufacturingName;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOfferedDate() {
        return offeredDate;
    }

    public void setOfferedDate(Date offeredDate) {
        this.offeredDate = offeredDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Set getCategories() {
        return categories;
    }

    public void setCategories(Set categories) {
        this.categories = categories;
    }

    public Set getBuyBidProduct() {
        return buyBidProduct;
    }

    public void setBuyBidProduct(Set buyBidProduct) {
        this.buyBidProduct = buyBidProduct;
    }
  
    
}
