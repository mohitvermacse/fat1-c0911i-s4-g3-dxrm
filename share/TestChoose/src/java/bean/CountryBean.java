/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import java.util.*;
import entity.Country;
/**
 *
 * @author UTAN
 */
public class CountryBean {
    private ArrayList<Country> ar = new ArrayList<Country>();

    /**
     * @return the ar
     */
    public ArrayList<Country> getAr() {
        return ar;
    }

    /**
     * @param ar the ar to set
     */
    public void setAr(ArrayList<Country> ar) {
        this.ar = ar;
    }
}
