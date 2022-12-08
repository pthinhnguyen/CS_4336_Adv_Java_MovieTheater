/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.MoviesEJB;
import ejb.TheatersEJB;
import entity.Movies;
import entity.Shows;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Thinh Nguyen
 */
@Named(value = "movieBean")
@SessionScoped
public class MovieBean implements Serializable {
    @EJB
    private MoviesEJB movieEJB;

    public MovieBean() {
        this.movieEJB = new MoviesEJB();
    }

    public List<Movies> getMovieList(int id_theater) {
        return this.movieEJB.getMoviesByTheaterId(id_theater);
    }
}
