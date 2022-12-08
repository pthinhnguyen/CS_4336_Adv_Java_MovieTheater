/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Thinh Nguyen
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Show.findById", query = "SELECT tm FROM TimeSlots tm WHERE tm.id = :id"),
    @NamedQuery(name = "Show.find_By_Theater_Movie_DateSlot_TimeSlot", query = "SELECT s" + 
            " FROM Shows s" +
            " INNER JOIN Theaters t ON t.id = s.id_theater" +
            " INNER JOIN Movies m ON m.id = s.id_movie" +
            " INNER JOIN DateSlots d ON d.id = s.id_dateslot" +
            " INNER JOIN TimeSlots tm ON tm.id = s.id_timeslot" +
            " WHERE t.id = :id_theater AND m.id = :id_movie AND d.id = :id_dateslot AND tm.id = :id_timeslot")
})
public class Shows implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID_SHOW")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_show;

    private int id_theater;
    
    private int id_movie;
    
    private int id_dateslot;
    
    private int id_timeslot;
    
    public int getId_show() {
        return id_show;
    }

    public void setId_show(int id_show) {
        this.id_show = id_show;
    }

    public int getId_theater() {
        return id_theater;
    }

    public void setId_theater(int id_theater) {
        this.id_theater = id_theater;
    }

    public int getId_movie() {
        return id_movie;
    }

    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    public int getId_dateslot() {
        return id_dateslot;
    }

    public void setId_dateslot(int id_dateslot) {
        this.id_dateslot = id_dateslot;
    }

    public int getId_timeslot() {
        return id_timeslot;
    }

    public void setId_timeslot(int id_timeslot) {
        this.id_timeslot = id_timeslot;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id_show;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shows)) {
            return false;
        }
        Shows other = (Shows) object;
        if (this.id_show != other.id_show) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Shows[ id=" + id_show + " ]";
    }
}
