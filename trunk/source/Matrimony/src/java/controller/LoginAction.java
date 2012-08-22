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
        String action = null;
        String user = from.getUserName();
        String pas = from.getPassword();
        if (ua.loginUser(user, pas)) {
            action = "user";
            ArrayList arrayReceive = (ArrayList) ua.getReceiveRequestByStatus(2);
            ArrayList arrayFriend = (ArrayList) ua.getAllFriend(2);
            request.setAttribute("listFriend", arrayFriend);
            request.setAttribute("listReceive", arrayReceive);
        } else {
            ArrayList arrayCity = (ArrayList) ua.getAllCity();
            request.setAttribute("listCity", arrayCity);
            action = "register";
        }
        return mapping.findForward(action);
    }
}
