/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.DateSlots;
import entity.TimeSlots;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thinh Nguyen
 */
@Stateless
public class TimeSlotsEJB {
    @PersistenceContext(unitName = "MovieTheaterPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    public TimeSlots getTimeSlotById(int id_timeSlot) {
        return em.createNamedQuery("DateSlots.findById", TimeSlots.class)
                .setParameter("id", id_timeSlot)
                .getSingleResult();
    }
    
    public List<TimeSlots> getTimeslots_by_Theater_Movie_DateSlot(int id_theater, int id_movie, int id_dateslot) {
        return em.createNamedQuery("TimeSlots.findTimeSlots_ByTheater_Movie_DateSlot", TimeSlots.class)
                .setParameter("id_theater", id_theater)
                .setParameter("id_movie", id_movie)
                .setParameter("id_dateslot", id_dateslot)
                .getResultList();
    }
}
