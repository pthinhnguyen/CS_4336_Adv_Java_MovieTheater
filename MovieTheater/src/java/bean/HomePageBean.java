/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.*;
import entity.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Thinh Nguyen
 */
@Named(value = "homePageBean")
@Dependent
public class HomePageBean {

    @EJB
    private MoviesEJB moviesEJB = new MoviesEJB();
    
    public HomePageBean() {
    }
    
    public List<Movies> getMovieList() {
        return moviesEJB.findAllMovies();
    }
}
