/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.*;
import entity.CustomStats;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UTAN
 */
public class StatBean {

    private int todaySum;
    private int monthSum;
    private ArrayList<CustomStats> arrS;
    

    /**
     * @return the todaySum
     */
    public int getTodaySum() {
        return todaySum;
    }

    /**
     * @param todaySum the todaySum to set
     */
    public void setTodaySum(int todaySum) {
        this.todaySum = todaySum;
    }

    /**
     * @return the monthSum
     */
    public int getMonthSum() {
        return monthSum;
    }

    /**
     * @param monthSum the monthSum to set
     */
    public void setMonthSum(int monthSum) {
        this.monthSum = monthSum;
    }

    /**
     * @return the arrS
     */
    public ArrayList<CustomStats> getArrS() {
        return arrS;
    }

    /**
     * @param arrS the arrS to set
     */
    public void setArrS(ArrayList<CustomStats> arrS) {
        this.arrS = arrS;
    }

    
}
