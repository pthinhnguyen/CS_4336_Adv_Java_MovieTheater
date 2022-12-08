/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Movies;
import entity.Shows;
import entity.Theaters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thinh Nguyen
 */
@Stateless
public class TheatersEJB {
    @PersistenceContext(unitName = "MovieTheaterPU")
    private EntityManager em;
    private List<Theaters> theaterList;
    private Set<String> zipcodeSet;

    public TheatersEJB() {
        this.theaterList = new ArrayList<>();
        this.zipcodeSet = new HashSet<String>(); 
    }
    
    public void persist(Object object) {
        em.persist(object);
    }
    
    public List<Theaters> getAllTheaters() {
        this.theaterList = em.createNamedQuery("Theaters.findAll", Theaters.class).getResultList();
        return this.theaterList;
    }
    
    public List<Theaters> getTheaterByZipCode(String zipcode) {
        return em.createNamedQuery("Theaters.findByZipCode", Theaters.class)
                .setParameter("zipcode", zipcode)
                .getResultList();
    }
    
    public List<String> getZipCodeSet() {
        this.theaterList = em.createNamedQuery("Theaters.findAll", Theaters.class).getResultList();
        
        for (Theaters theaterItem : this.theaterList) {
            this.zipcodeSet.add(theaterItem.getZipcode());
        }
        
        return new ArrayList<String>(this.zipcodeSet);
    }
    
    public Theaters getTheaterById(int id_theater) {
        return em.createNamedQuery("Theaters.findById", Theaters.class)
                .setParameter("id", id_theater)
                .getSingleResult();
    }
}
