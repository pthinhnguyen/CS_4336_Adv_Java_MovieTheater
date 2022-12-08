/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.DateSlotsEJB;
import ejb.MoviesEJB;
import ejb.TimeSlotsEJB;
import entity.DateSlots;
import entity.Movies;
import entity.TimeSlots;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Thinh Nguyen
 */
@Named(value = "dateTimeBean")
@SessionScoped
public class DateTimeBean implements Serializable {
    @EJB
    private MoviesEJB movieEJB;
    
    @EJB
    private DateSlotsEJB dateslotEJB;
    
    @EJB
    private TimeSlotsEJB timeslotEJB;
    
    private DateSlots curDateSlot;
    private TimeSlots curTimeSlot;
    private boolean showTimeSlotList;
    private boolean showDateTimeReview;
    
    public DateTimeBean() {
        this.movieEJB = new MoviesEJB();
        this.dateslotEJB = new DateSlotsEJB();
        this.timeslotEJB = new TimeSlotsEJB();
        
        this.curDateSlot = new DateSlots();
        this.curTimeSlot = new TimeSlots();
        
        this.showTimeSlotList = false;
        this.showDateTimeReview = false;
    }

    public DateSlots getCurDateSlot() {
        return curDateSlot;
    }

    public void setCurDateSlot(DateSlots curDateSlot) {
        this.curDateSlot = curDateSlot;
    }

    public TimeSlots getCurTimeSlot() {
        return curTimeSlot;
    }

    public void setCurTimeSlot(TimeSlots curTimeSlot) {
        this.curTimeSlot = curTimeSlot;
    }

    public boolean isShowTimeSlotList() {
        return showTimeSlotList;
    }

    public void setShowTimeSlotList(boolean showTimeSlotList) {
        this.showTimeSlotList = showTimeSlotList;
    }

    public boolean isShowDateTimeReview() {
        return showDateTimeReview;
    }

    public void setShowDateTimeReview(boolean showDateTimeReview) {
        this.showDateTimeReview = showDateTimeReview;
    }
    
    public void selectDate(DateSlots dateItem) {
        this.showTimeSlotList = true;
        this.curDateSlot = dateItem;
    }
    
//    public void selectTime(TimeSlots timeItem) {
//        this.showDateTimeReview = true;
//        this.curTimeSlot = timeItem;
//    }
    
    public Movies getMovie(int id_movie) {
        return this.movieEJB.getMovieById(id_movie);
    }
    
    public List<DateSlots> getDateSlotList(int id_theater, int id_movie) {
        return this.dateslotEJB.getDateSlots_by_Theater_Movie(id_theater, id_movie);
    }
    
    public List<TimeSlots> getTimeSlotList(int id_theater, int id_movie, int id_dateslot) {
        return this.timeslotEJB.getTimeslots_by_Theater_Movie_DateSlot(id_theater, id_movie, id_dateslot);
    }
    
}
