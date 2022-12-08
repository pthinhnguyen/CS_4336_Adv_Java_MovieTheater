/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.TheatersEJB;
import entity.Theaters;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Thinh Nguyen
 */
@Named(value = "theatersBean")
@SessionScoped
public class TheatersBean implements Serializable {
    @EJB
    private TheatersEJB theaterEJB;
    
    private String zipcode = "null";
    private boolean showTheaterList = false;
    
    public TheatersBean() {
        this.theaterEJB = new TheatersEJB();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isShowTheaterList() {
        return showTheaterList;
    }

    public void setShowTheaterList(boolean showTheaterList) {
        this.showTheaterList = showTheaterList;
    }
    
    public void displayTheaterList(String zipcode) {
        this.showTheaterList = true;
        this.zipcode = zipcode;
    }
    
    public List<Theaters> getTheaterList() {
        if (this.zipcode.isEmpty() || this.zipcode == "null") {
            return theaterEJB.getAllTheaters();
        }
        else {
            return theaterEJB.getTheaterByZipCode(zipcode);
        }
    }
    
    public List<String> getZipCodeSet() {
        return theaterEJB.getZipCodeSet();
    }
}
