/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Karim
 */
public class Teacher extends Person implements Serializable{
    private Date hireDate;
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
