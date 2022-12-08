/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Thinh Nguyen
 */
@Named(value = "_dummy_bean_")
@Dependent
public class _dummy_bean_ {
    private List<Integer> dummyRows1 = new ArrayList<>();

    public List<Integer> getDummyRows1() {
        return dummyRows1;
    }

    public void setDummyRows1(List<Integer> dummyRows1) {
        this.dummyRows1 = dummyRows1;
    }
    public _dummy_bean_() {
        this.dummyRows1.add(2022);
    }
    
}
