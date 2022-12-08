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
    @NamedQuery(name = "DateSlots.findById", query = "SELECT d FROM DateSlots d WHERE d.id = :id"),
    @NamedQuery(name = "DateSlots.findDateSlots_ByTheater_Movie", query = "SELECT DISTINCT d" + 
            " FROM Shows s" +
            " INNER JOIN Theaters t ON t.id = s.id_theater" +
            " INNER JOIN Movies m ON m.id = s.id_movie" +
            " INNER JOIN DateSlots d ON d.id = s.id_dateslot" +
            " INNER JOIN TimeSlots tm ON tm.id = s.id_timeslot" +
            " WHERE t.id = :id_theater AND m.id = :id_movie")
})
public class DateSlots implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String date_t;

    public DateSlots() {
        this.date_t = "";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_t() {
        return date_t;
    }

    public void setDate_t(String date_t) {
        this.date_t = date_t;
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
        if (!(object instanceof DateSlots)) {
            return false;
        }
        DateSlots other = (DateSlots) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DateSlots[ id=" + id + " ]";
    }
    
}
