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
    @NamedQuery(name = "TimeSlots.findById", query = "SELECT tm FROM TimeSlots tm WHERE tm.id = :id"),
    @NamedQuery(name = "TimeSlots.findTimeSlots_ByTheater_Movie_DateSlot", query = "SELECT DISTINCT tm" + 
            " FROM Shows s" +
            " INNER JOIN Theaters t ON t.id = s.id_theater" +
            " INNER JOIN Movies m ON m.id = s.id_movie" +
            " INNER JOIN DateSlots d ON d.id = s.id_dateslot" +
            " INNER JOIN TimeSlots tm ON tm.id = s.id_timeslot" +
            " WHERE t.id = :id_theater AND m.id = :id_movie AND d.id = :id_dateslot")
})
public class TimeSlots implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String time_t;

    public TimeSlots() {
        this.time_t = "";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime_t() {
        return time_t;
    }

    public void setTime_t(String time_t) {
        this.time_t = time_t;
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
        if (!(object instanceof TimeSlots)) {
            return false;
        }
        TimeSlots other = (TimeSlots) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TimeSlots[ id=" + id + " ]";
    }
    
}
