/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author nvc
 */
public class StatisticForm extends org.apache.struts.action.ActionForm {
    
    private String aDay,aMonth,action,aYear,maping;
   

    /**
     *
     */
    public StatisticForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getaDay() == null || getaDay().length() < 1) {
            errors.add("aDay", new ActionMessage("error.aDay.required"));
            // TODO: add 'error.name.required' key to your resources
        }
         if (getaMonth() == null || getaMonth().length() < 1) {
            errors.add("aMonth", new ActionMessage("error.aMonth.required"));
            // TODO: add 'error.name.required' key to your resources
        }
         if (getaYear() == null || getaYear().length() < 1) {
            errors.add("aYear", new ActionMessage("error.aYear.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    /**
     * @return the aDay
     */
    public String getaDay() {
        return aDay;
    }

    /**
     * @param aDay the aDay to set
     */
    public void setaDay(String aDay) {
        this.aDay = aDay;
    }

    /**
     * @return the aMonth
     */
    public String getaMonth() {
        return aMonth;
    }

    /**
     * @param aMonth the aMonth to set
     */
    public void setaMonth(String aMonth) {
        this.aMonth = aMonth;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the aYear
     */
    public String getaYear() {
        return aYear;
    }

    /**
     * @param aYear the aYear to set
     */
    public void setaYear(String aYear) {
        this.aYear = aYear;
    }

    /**
     * @return the maping
     */
    public String getMaping() {
        return maping;
    }

    /**
     * @param maping the maping to set
     */
    public void setMaping(String maping) {
        this.maping = maping;
    }
}
