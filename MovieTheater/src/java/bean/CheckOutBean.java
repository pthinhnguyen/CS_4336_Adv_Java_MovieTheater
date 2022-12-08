/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.MoviesEJB;
import ejb.TheatersEJB;
import entity.Movies;
import entity.Theaters;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Thinh Nguyen
 */
@Named(value = "checkOutBean")
@RequestScoped
public class CheckOutBean {
    @EJB
    private MoviesEJB movieEJB;
    
    @EJB
    private TheatersEJB theaterEJB;
    
    private String nameOnCard = "";
    private BigDecimal creaditCardNumber;
    private String expDate = "";
    private String expMonth = "";
    private BigDecimal expYear;
    
    public CheckOutBean() {
        this.movieEJB = new MoviesEJB();
        this.theaterEJB = new TheatersEJB();
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public BigDecimal getCreaditCardNumber() {
        return creaditCardNumber;
    }

    public void setCreaditCardNumber(BigDecimal creaditCardNumber) {
        this.creaditCardNumber = creaditCardNumber;
    }

    public BigDecimal getExpYear() {
        return expYear;
    }

    public void setExpYear(BigDecimal expYear) {
        this.expYear = expYear;
    }
    
    
    public Movies getMovie(int id_movie) {
        return movieEJB.getMovieById(id_movie);
    }
    
    public Theaters getTheater(int id_theater) {
        return theaterEJB.getTheaterById(id_theater);
    }
}
