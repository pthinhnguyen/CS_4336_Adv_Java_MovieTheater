/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Shows;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thinh Nguyen
 */
@Stateless
public class ShowsEJB {
@PersistenceContext(unitName = "MovieTheaterPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    public Shows getShow_by_Theater_Movie_DateSlot_TimeSlot(int id_theater, int id_movie, int id_dateslot, int id_timeslot) {
        return em.createNamedQuery("Show.find_By_Theater_Movie_DateSlot_TimeSlot", Shows.class)
                .setParameter("id_theater", id_theater)
                .setParameter("id_movie", id_movie)
                .setParameter("id_dateslot", id_dateslot)
                .setParameter("id_timeslot", id_timeslot)
                .getSingleResult();
    }
}
