/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.DateSlots;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thinh Nguyen
 */
@Stateless
public class DateSlotsEJB {
    @PersistenceContext(unitName = "MovieTheaterPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    public DateSlots getDateSlotById(int id_dateSlot) {
        return em.createNamedQuery("DateSlots.findById", DateSlots.class)
                .setParameter("id", id_dateSlot)
                .getSingleResult();
    }
    
    public List<DateSlots> getDateSlots_by_Theater_Movie(int id_theater, int id_movie) {
        return em.createNamedQuery("DateSlots.findDateSlots_ByTheater_Movie", DateSlots.class)
                .setParameter("id_theater", id_theater)
                .setParameter("id_movie", id_movie)
                .getResultList();
    }
}
