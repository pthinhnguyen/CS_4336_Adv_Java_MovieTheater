/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.*;
import env.Env;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Thinh Nguyen
 */
@Stateless
public class MoviesEJB {
    @PersistenceContext(unitName = "MovieTheaterPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    public List<Movies> findAllMovies()
    {
        List<Movies> listMovies = new ArrayList<>();
        listMovies = em.createNamedQuery("Movies.findAll", Movies.class).getResultList();
        return listMovies;
    }
    
    public Movies getMovieById(int id_movie) {
        return em.createNamedQuery("Movies.findById", Movies.class)
                .setParameter("id", id_movie)
                .getSingleResult();
    }
    
    public List<Movies> getMoviesByTheaterId(int id_theater) {
        List<Movies> tmp =  em.createNamedQuery("Movies.findMoviesByTheater", Movies.class)
                .setParameter("id", id_theater)
                .getResultList();
        return tmp;
    }
}
