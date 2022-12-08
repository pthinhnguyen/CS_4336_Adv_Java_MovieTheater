/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import ejb.OrdersEJB;
import ejb.ShowsEJB;
import entity.DateSlots;
import entity.Movies;
import entity.Orders;
import entity.Theaters;
import entity.Ticket;
import entity.TimeSlots;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author Thinh Nguyen
 */
@ManagedBean
@Named(value = "ticketBean")
@SessionScoped
public class TicketBean implements Serializable {
    private Ticket TicketInstance = new Ticket();
    
    @EJB
    private ShowsEJB showEJB;
    
    @EJB
    private OrdersEJB orderEJB;
    
    public TicketBean() {
        this.showEJB = new ShowsEJB();
        this.showEJB = new ShowsEJB();
    }

    public Ticket getTicketInstance() {
        return TicketInstance;
    }

    public void setTicketInstance(Ticket TicketInstance) {
        this.TicketInstance = TicketInstance;
    }
    
    public String redirectToMovieSelection(Theaters theaterItem) {
        this.TicketInstance.setTheater_str(theaterItem.getName_t());
        this.TicketInstance.setId_theater(theaterItem.getId());
        this.TicketInstance.setAddress(theaterItem.getStreet() + ", " + theaterItem.getState_t() + ", " + theaterItem.getZipcode());
        System.out.println(this.TicketInstance);
        
        return "movies.xhtml";
    }
    
    public String redirectToDateTimeSelection(Movies movieItem) {
        this.TicketInstance.setId_movie(movieItem.getId());
        this.TicketInstance.setMovie_str(movieItem.getTitle());
        this.TicketInstance.setDescription(movieItem.getDescription_m());
        this.TicketInstance.setPoster(movieItem.getPoster());
        System.out.println(this.TicketInstance);
        
        return "datetime.xhtml";
    }
    
    public String redirectToSeatSelection(DateSlots dateItem, TimeSlots timeItem) {
        this.TicketInstance.setId_dateslot(dateItem.getId());
        this.TicketInstance.setDateslot_str(dateItem.getDate_t());
        
        this.TicketInstance.setId_timeslot(timeItem.getId());
        this.TicketInstance.setTimeslot_str(timeItem.getTime_t());
        
        System.out.println(this.TicketInstance);
        
        return "seats.xhtml";
    }
    
    public String redirectToCheckOut(String printSelectedSeatSet, Set<String> selectedSeatSet) {
        int n = selectedSeatSet.size();
        List<String> selectedSeatList = new ArrayList<String>(n);
        this.TicketInstance.setSeatCodeList(printSelectedSeatSet);
        this.TicketInstance.setQuantity(String.valueOf(n));
        this.TicketInstance.setTotal_paid(String.valueOf((float)n * 10.0));
        
        System.out.println(this.TicketInstance);
        
        return "checkout.xhtml";
    }
    
    public String redirectToDone(String nameOnCard, BigDecimal creaditCardNumber, String expMonth, BigDecimal expYear) {
        this.TicketInstance.setNameOnCard(nameOnCard);
        this.TicketInstance.setCreaditCardNumber(String.valueOf(creaditCardNumber));
        this.TicketInstance.setExpDate(expMonth + "/" + String.valueOf(expYear));
        
        System.out.println(this.TicketInstance);
        
        int id_show = showEJB.getShow_by_Theater_Movie_DateSlot_TimeSlot(
                this.TicketInstance.getId_theater(), 
                this.TicketInstance.getId_movie(), 
                this.TicketInstance.getId_dateslot(), 
                this.TicketInstance.getId_timeslot()).getId_show();
        
        Orders newOrder = new Orders();
        newOrder.setId_show(id_show);
        newOrder.setSeat_code(this.TicketInstance.getSeatCodeList());
        newOrder.setQuantity(Integer.parseInt(this.TicketInstance.getQuantity()));
        newOrder.setTotal_paid(Float.parseFloat(this.TicketInstance.getTotal_paid()));
        
        try {
            this.orderEJB.persist(newOrder);
        } catch(Exception e) {
        }
        
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "done.xhtml";
    }
}
