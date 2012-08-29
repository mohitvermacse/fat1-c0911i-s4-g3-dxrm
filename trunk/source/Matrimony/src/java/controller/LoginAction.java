/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
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
public class LoginAction extends org.apache.struts.action.Action {

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
        LoginForm from = (LoginForm) form;
        UserAccess ua = new UserAccess();

        String user = from.getUserName();
        String pas = from.getPassword();
        try {
            if (ua.loginUser(user, pas)) {
                ArrayList arrayReceive = (ArrayList) ua.getAllReceiveRequestByStatus(1);
                ArrayList arrayFriend = (ArrayList) ua.getAllFriend(1);
                request.setAttribute("listFriend", arrayFriend);
                request.setAttribute("listReceive", arrayReceive);
                return mapping.findForward("user");
            } else {
                ArrayList arrayCity = (ArrayList) ua.getAllCity();
                ArrayList arrayCountry = (ArrayList) ua.getAllCountry();
                request.setAttribute("listCity", arrayCity);
                request.setAttribute("listCountry", arrayCountry);

                return mapping.findForward("register");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return mapping.findForward("error");
        }

    }
}
