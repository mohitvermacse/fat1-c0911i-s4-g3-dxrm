/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author nvc
 */
public class StatisticAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        StatisticForm statistic = (StatisticForm) form;
        UserAccess ua = new UserAccess();

        String aday = statistic.getaDay();
        String amonth = statistic.getaMonth();
        String ayear = statistic.getaYear();
        int month = Integer.parseInt(amonth);
        int year = Integer.parseInt(ayear);

        String action = statistic.getAction();
        String map = null;//statistic.getMaping();
        try {
            if (action.equalsIgnoreCase("Total user have friend")) {
                map = "sta";
                String result =" Total user have friend: "+ ua.getAllUserHaveFriend();
                request.setAttribute("friend", result);
            }
            if (action.equalsIgnoreCase("Total User Of System")) {
                map = "sta";
                String result =" Total User Of System: "+ ua.getTotalUser();
                request.setAttribute("total", result);
            }
            if (action.equalsIgnoreCase("Total New User Of A Month")) {
                map = "sta";
                String result =" Total New User Of Month "+ amonth +"/"+ ayear +" is: "+ ua.getTotalNewUserMonth(month, year);
                request.setAttribute("amonth", result);
            }
            if (action.equalsIgnoreCase("Total User Of A Day")) {
                map = "sta";
                String result =" Total User Of Day: "+ aday +" is: "+ ua.getTotalNewUserToday(aday + " 0:00:00", aday + " 23:59:59");
                request.setAttribute("aday", result);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return mapping.findForward(map);
    }
}
