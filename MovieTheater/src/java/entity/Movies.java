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
    @NamedQuery(name = "Movies.findAll", query = "SELECT m FROM Movies m"),
    @NamedQuery(name = "Movies.findById", query = "SELECT m FROM Movies m WHERE m.id = :id"),
    @NamedQuery(name = "Movies.findMoviesByTheater", query = "SELECT DISTINCT m" + 
            " FROM Shows s" +
            " INNER JOIN Theaters t ON t.id = s.id_theater" +
            " INNER JOIN Movies m ON m.id = s.id_movie" +
            " INNER JOIN DateSlots d ON d.id = s.id_dateslot" +
            " INNER JOIN TimeSlots tm ON tm.id = s.id_timeslot" +
            " WHERE t.id = :id")
})
public class Movies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String title;
    
    private String description_m;
    
    private String poster;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription_m() {
        return description_m;
    }

    public void setDescription_m(String description_m) {
        this.description_m = description_m;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
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
        if (!(object instanceof Movies)) {
            return false;
        }
        Movies other = (Movies) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movies[ id=" + id + " ]";
    }
    
}
