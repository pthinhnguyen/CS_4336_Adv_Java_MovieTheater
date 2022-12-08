/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Thinh Nguyen
 */
@Named(value = "seatBean")
@SessionScoped
public class SeatBean implements Serializable {

    private List<String> alaphetRow;
    private List<String> numericCol;
    private boolean showSummary;
    Set<String> selectedSeatSet;
    
    public SeatBean() {
        this.alaphetRow = new ArrayList<>();
        this.numericCol = new ArrayList<>();
        this.showSummary = false;
        this.selectedSeatSet = new LinkedHashSet<String>();
        
        String alphabetString = "ABCDEFGHI";
        for (int i = 0; i < alphabetString.length(); i++) {
            this.alaphetRow.add(String.valueOf(alphabetString.charAt(i)));
        }
        
        for (int i = 1; i < 11; i++) {
            this.numericCol.add(String.valueOf(i));
        }
    }

    public List<String> getAlaphetRow() {
        return alaphetRow;
    }

    public List<String> getNumericCol() {
        return numericCol;
    }

    public boolean isShowSummary() {
        return showSummary;
    }

    public Set<String> getSelectedSeatSet() {
        return selectedSeatSet;
    }
    
    public void selectSeat(String rowItem, String columnItem) {
        this.showSummary = true;
        this.selectedSeatSet.add(rowItem + columnItem);
    }
    
    public String printSelectedSeatSet() {
        String result = "";
        for (String seat : this.selectedSeatSet)
            result = result + seat + " ";
            
        return result;
    }
    
    public void resetSelection() {
        this.showSummary = false;
        this.selectedSeatSet = new LinkedHashSet<String>();
    }
}
