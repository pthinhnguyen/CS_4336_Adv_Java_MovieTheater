/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;

/**
 *
 * @author Thinh Nguyen
 */
@Named(value = "doneBean")
@Dependent
public class DoneBean {

    /**
     * Creates a new instance of DoneBean
     */
    public DoneBean() {
    }

    public String startOver() {
        return "homePage.xhtml";
    }

}
