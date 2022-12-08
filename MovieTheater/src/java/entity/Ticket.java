/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thinh Nguyen
 */
public class Ticket {
    private int id_theater = 0;
    private String theater_str = "null";
    private String address = "null";
    
    private int id_movie = 0;
    private String movie_str = "null";
    private String description = "null";
    private String poster = "null";
    
    private int id_dateslot = 0;
    private String dateslot_str = "null";
    
    private int id_timeslot = 0;
    private String timeslot_str = "null";
    
    private String seatCodeList = "null";
    private String quantity = "null";
    private String total_paid = "null";
    
    private String creaditCardNumber = "null";
    private String expDate = "null";
    private String nameOnCard = "null";

    public Ticket() {
    }

    public int getId_theater() {
        return id_theater;
    }

    public void setId_theater(int id_theater) {
        this.id_theater = id_theater;
    }

    public int getId_movie() {
        return id_movie;
    }

    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    public int getId_dateslot() {
        return id_dateslot;
    }

    public void setId_dateslot(int id_dateslot) {
        this.id_dateslot = id_dateslot;
    }

    public int getId_timeslot() {
        return id_timeslot;
    }

    public void setId_timeslot(int id_timeslot) {
        this.id_timeslot = id_timeslot;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotal_paid() {
        return total_paid;
    }

    public void setTotal_paid(String total_paid) {
        this.total_paid = total_paid;
    }

    public String getTheater_str() {
        return theater_str;
    }

    public void setTheater_str(String theater_str) {
        this.theater_str = theater_str;
    }

    public String getMovie_str() {
        return movie_str;
    }

    public void setMovie_str(String movie_str) {
        this.movie_str = movie_str;
    }

    public String getDateslot_str() {
        return dateslot_str;
    }

    public void setDateslot_str(String dateslot_str) {
        this.dateslot_str = dateslot_str;
    }

    public String getTimeslot_str() {
        return timeslot_str;
    }

    public void setTimeslot_str(String timeslot_str) {
        this.timeslot_str = timeslot_str;
    }

    public String getSeatCodeList() {
        return seatCodeList;
    }

    public void setSeatCodeList(String seatCodeList) {
        this.seatCodeList = seatCodeList;
    }

    public String getCreaditCardNumber() {
        return creaditCardNumber;
    }

    public void setCreaditCardNumber(String creaditCardNumber) {
        this.creaditCardNumber = creaditCardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
    
    @Override
    public String toString() {
        String res = "\n";
        
        res = res + "theater_id: " + String.valueOf(this.id_theater) + "\n";
        res = res + "theater_name: " + this.theater_str + "\n";
        res = res + "theater adddress: " + this.address + "\n";
        
        res = res + "id_movie: "+ String.valueOf(this.id_movie) + "\n";
        res = res + "movie name: " + this.movie_str  + "\n";
        res = res + "movie description: " + this.description  + "\n";
        res = res + "movie poster: " + this.poster  + "\n";
        
        res = res + "dateslot_id: " + String.valueOf(this.id_dateslot) + "\n";
        res = res + "date slot: " + this.dateslot_str + "\n";
        
        res = res + "timeslot_id: "+ String.valueOf(this.id_timeslot) + "\n";
        res = res + "time slot: " + this.timeslot_str  + "\n";
        
        res = res + "seat codes: " + this.seatCodeList + "\n";
        
        res = res + "quantiy: " + String.valueOf(this.quantity) + "\n";
        res = res + "total paid: " + String.valueOf(this.total_paid) + "\n";
        
        res = res + "name on card: " + this.nameOnCard + "\n";
        res = res + "credit card number: " + this.creaditCardNumber + "\n";
        res = res + "expiration date: " + this.expDate;
        
        return res;
    }
    
}
