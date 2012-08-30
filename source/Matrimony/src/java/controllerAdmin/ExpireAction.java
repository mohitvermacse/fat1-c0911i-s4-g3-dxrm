/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import bean.UserAccess;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author nvc
 */
public class ExpireAction extends org.apache.struts.action.Action {

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
        ExpireForm ef = (ExpireForm) form;
        UserAccess ua = new UserAccess();

        String d = request.getParameter("dates");
        String fullName = ef.getFullName();
        java.util.Date date = ef.getExpireDa();
        String userName = ef.getUserName();

        String to = "kukaravn@gmail.com";// ef.getEmail();
        String subject = "Expire date account";
        String content = "Your account <h3 style='font-style: italic; font: bold'> " + userName + "</h3> on matrimony.com expired to the day " + date;

        System.out.println("\nEmail: " + to + "\nFull Name: " + fullName + "\nExpire Date: " + date);

       
        if (ua.send(to, subject, content)) {
            ArrayList arrayUserExpired = (ArrayList) ua.getAllUserExpired();
            request.setAttribute("listUserExpired", arrayUserExpired);
            return mapping.findForward("success");
        }
        return mapping.findForward("error");
    }
}
