/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.StatBean;
import bean.StatBus;
import bean.UserAccess;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author nvc
 */
public class StatistAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "sta";

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
        try {
            HttpSession session = request.getSession(false);
            UserAccess ua = new UserAccess();
            StatBean stBe = new StatBean();
            StatBus stBu = new StatBus();
            stBe.setTodaySum(stBu.getTodayTotal());
            stBe.setMonthSum(stBu.getMonthTotal());
            if (form != null) {
                StatistForm sf = (StatistForm) form;
                stBe.setArrS(stBu.getCustomStats(sf.getStartDate(), sf.getEndDate()));

                String aDay = "Total new user of a day " + sf.getaDay() + " : " + ua.getTotalNewUserToday(sf.getaDay());
                ArrayList arrayNewUser = (ArrayList) ua.getInforNewUserToday(sf.getaDay());

                String aMonth = "Total new user of a month " + sf.getaMonth() + " : " + ua.getTotalNewUserAMonth(sf.getaMonth());
             

                ArrayList arrayNewUserAmonth = (ArrayList) ua.getInforNewUserAMonth(sf.getaMonth());

                int totalSystem = ua.getTotalUser();
                String totalfriend = ua.getAllUserHaveFriend();
                request.setAttribute("friend", totalfriend);
                request.setAttribute("total", totalSystem);
                request.setAttribute("totalUserAMonth", aMonth);
                request.setAttribute("listNewUserAmonth", arrayNewUserAmonth);
                request.setAttribute("listNewUser", arrayNewUser);
                request.setAttribute("totalUser", aDay);

                System.out.println("A Day: " + sf.getaDay());
                System.out.println("A Month: " + sf.getaMonth());
            }
            session.setAttribute("statBean", stBe);
        } catch (Exception e) {
            System.out.println("Error Hi: " + e.getMessage());
        }

        return mapping.findForward(SUCCESS);
    }
}
