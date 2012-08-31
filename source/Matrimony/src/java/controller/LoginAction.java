/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
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
        //HttpSession session = request.getSession(false);
        LoginForm from = (LoginForm) form;
        UserAccess ua = new UserAccess();

        String user = from.getUserName();
        String pas = from.getPassword();
        System.out.println(user +"\n"+ pas);
        try {
            if (ua.loginUser(user, pas)) {
                int id = ua.getIdUserByUserName(user);
                ArrayList arrayReceive = (ArrayList) ua.getAllReceiveRequestByStatus(id);
                ArrayList arrayFriend = (ArrayList) ua.getAllFriend(id);
                request.setAttribute("listFriend", arrayFriend);
                request.setAttribute("listReceive", arrayReceive);
                
                //session.setAttribute("idUser", id);
                return mapping.findForward("user");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return mapping.findForward("error");
        }
        return mapping.findForward("error");
    }
}
