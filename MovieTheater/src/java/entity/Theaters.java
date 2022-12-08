/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Thinh Nguyen
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Theaters.findAll", query = "SELECT t FROM Theaters t"),
    @NamedQuery(name = "Theaters.findById", query = "SELECT t FROM Theaters t WHERE t.id = :id"),
    @NamedQuery(name = "Theaters.findByZipCode", query = "SELECT t FROM Theaters t WHERE t.zipcode = :zipcode"),
    @NamedQuery(name = "Theaters.findShows", query = "SELECT s" + 
            " FROM Shows s" +
            " INNER JOIN Theaters t ON t.id = s.id_theater" +
            " INNER JOIN Movies m ON m.id = s.id_movie" +
            " INNER JOIN DateSlots d ON d.id = s.id_dateslot" +
            " INNER JOIN TimeSlots tm ON tm.id = s.id_timeslot" +
            " WHERE t.id = :id"),
    @NamedQuery(name = "Theaters.findMovies", query = "SELECT DISTINCT m" + 
            " FROM Shows s" +
            " INNER JOIN Theaters t ON t.id = s.id_theater" +
            " INNER JOIN Movies m ON m.id = s.id_movie" +
            " INNER JOIN DateSlots d ON d.id = s.id_dateslot" +
            " INNER JOIN TimeSlots tm ON tm.id = s.id_timeslot" +
            " WHERE t.id = :id")
})
public class Theaters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name_t;
    private String street;
    private String state_t;
    private String zipcode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_t() {
        return name_t;
    }

    public void setName_t(String name_t) {
        this.name_t = name_t;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState_t() {
        return state_t;
    }

    public void setState_t(String state_t) {
        this.state_t = state_t;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theaters)) {
            return false;
        }
        Theaters other = (Theaters) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Theaters[ id=" + id + " ]";
    }
    
}
