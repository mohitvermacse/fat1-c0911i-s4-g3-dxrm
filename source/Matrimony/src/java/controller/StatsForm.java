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
 * @author UTAN
 */
public class StatsForm extends org.apache.struts.action.ActionForm {

    private String startDate;
    private String endDate;
    private String aDay;
    private int userId;
    private String email;

    /**
     *
     */
    public StatsForm() {
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
//        if (getStartDate() == null || getStartDate().length() < 1) {
//            errors.add("startDate", new ActionMessage("error.date.required"));            
//        }
//        if (getEndDate() == null || getEndDate().length() < 1) {
//            errors.add("endDate", new ActionMessage("error.date.required"));            
//        }
        return errors;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
